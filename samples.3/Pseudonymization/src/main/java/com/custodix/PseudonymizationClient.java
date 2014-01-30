package com.custodix;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import javax.xml.namespace.QName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.custodix.mpi._1.PseudonymizationRequest;
import com.custodix.mpi._1.PseudonymizationResponse;
import com.custodix.mpi._1.Subject;
import com.custodix.mpi._1.WsLinkedPseudonym;
import com.custodix.mpi._1.WsNationalIdentificationNumber;
import com.custodix.mpi._1_0.AccessDeniedException;
import com.custodix.mpi._1_0.DataValidationException;
import com.custodix.mpi._1_0.InternalError;
import com.custodix.mpi._1_0.PseudonymizationService;
import com.custodix.mpi._1_0.PseudonymizationService_Service;

/**
 * Sample implementation of a pseudonymization client, can be used to get a pseudonym using BSN as an identifier
 * @author Jelle
 *
 */
public class PseudonymizationClient {
	
	/// URL pointing to the WSDL location
    public final static URL WSDL_LOCATION;

    /// Wsdl location
    private static final String ENDPOINT = "https://pims-dev-trait.custodix.com/pims/services/PseudonymizationService?wsdl";
    
    /// Location of the service
    private static final String BINDING = "https://pims-dev-trait.custodix.com/pims/services/PseudonymizationService";
    
    /// Name of the service
    public final static QName SERVICE = new QName("http://www.custodix.com/MPI/1.0", "PseudonymizationService");
    
    /// Port name
    public final static QName PseudonymizationServicePort = new QName("http://www.custodix.com/MPI/1.0", "PseudonymizationServicePort");
    
    /// Username, not used for X509 authentication
    private  String userName;
    
    /// Password, not used for X509 authentication
    private  String password;
    
    /// Client keystore configuration
    private String keyConfig;
    
    /// Client keystore key alias
    private String keyName;
    
    static {
        URL url = null;
        try {
            url = new URL("https://pims-dev-trait.custodix.com/pims/services/PseudonymizationService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PseudonymizationClient.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", ENDPOINT);
        }
        WSDL_LOCATION = url;
    }
    
    public PseudonymizationClient() {
	}
    
    /**
     * 
     * @return
     */
    public  String getPassword() {
		return password;
	}
    
    /**
     * 
     * @param password
     */
    public  void setPassword(String password) {
    	this.password = password;
	}
    
    /**
     * 
     * @return
     */
    public  String getUserName() {
		return userName;
	}
    
    /**
     * 
     * @param userName
     */
    public  void setUserName(String userName) {
    	this.userName = userName;
	}
    
    /**
     * 
     * @return
     */
    public String getKeyConfig() {
		return keyConfig;
	}
    
    /**
     * 
     * @param keyConfig
     */
    public void setKeyConfig(String keyConfig) {
		this.keyConfig = keyConfig;
	}
    
    /**
     * 
     * @return
     */
    public String getKeyName() {
		return keyName;
	}
    
    /**
     * 
     * @param keyName
     */
    public void setKeyName(String keyName) {
		this.keyName = keyName;
	}
    
    /**
     * Do the pseudonymization request, request a pseudonym for a certain BSN in a certain realm
     * @param bsn BSN to pseudonymize
     * @param realm realm to use
     * @return The pseudonymization response containing pseudonyms
     * 
     * @throws InternalError
     * @throws DataValidationException
     * @throws AccessDeniedException
     * @throws MalformedURLException
     */
    public PseudonymizationResponse doRequest(String bsn, String realm) throws InternalError, DataValidationException, AccessDeniedException, MalformedURLException {

    	// Create the service
    	PseudonymizationService_Service service = new PseudonymizationService_Service(URI.create(ENDPOINT).toURL());
		QName name = new QName("http://www.custodix.com/MPI/1.0","PseudonymizationServicePort");
		service.addPort(name, "http://schemas.xmlsoap.org/soap/", BINDING);
    	PseudonymizationService serv = service.getPort(name, PseudonymizationService.class);
    	
    	// Generate a request
    	PseudonymizationRequest request = new PseudonymizationRequest();
    	request.setRealm(realm);
    	
    	Subject subject = new Subject();
    	
    	WsNationalIdentificationNumber nid = new WsNationalIdentificationNumber();
    	nid.setDomain("BSN");
    	nid.setValue(bsn);
    	subject.getNationalIdentificationNumber().add(nid);
    	
    	request.getSubject().add(subject);
    	
    	// Send the request to the service
		return serv.requestPseudonyms(request);
	
    }
    
    /**
     * Sample main method
     * @param args
     */
	public static void main(String[] args) {

		if(args.length  != 4) {
			System.out.println("Required arguments: BSN Realm keystore_config key_alias");
			return;
		}
		
		System.out.println("Initializing spring context");
		// Load the application context
		ApplicationContext ctx = new GenericXmlApplicationContext("resources/cxf-beans.xml");
		
		// Get the client
		PseudonymizationClient client = (PseudonymizationClient) ctx.getBean("client");
		
		
		try {
			// Get the configuration file, allow absolute and relative paths
			File file = new File(args[2]);
			if(!file.exists()) {
				System.out.println("File "+args[2]+" does not exist.");
				return;
			}
			
			client.setKeyConfig("file:///"+file.getAbsolutePath());
			client.setKeyName(args[3]);
			
			// Do the request
			System.out.println("Sending request to server.");
			PseudonymizationResponse response = client.doRequest(args[0], args[1]);
			
			// Get the response
			System.out.println("Response: ");
			for(WsLinkedPseudonym pseudonym : response.getLinkedPseudonym()) {
				System.out.println(pseudonym.getValue());
			}
			
		} catch (InternalError e) {
			e.printStackTrace();
		} catch (DataValidationException e) {
			e.printStackTrace();
		} catch (AccessDeniedException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
}
