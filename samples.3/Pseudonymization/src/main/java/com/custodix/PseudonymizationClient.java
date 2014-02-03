package com.custodix;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.Bus;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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
    public PseudonymizationResponse doRequest(String bsn, String realm)
        throws InternalError, DataValidationException, AccessDeniedException, MalformedURLException
    {
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
     * This method was created so that this sample can be easily hooked into other programs (like the CTP, the Clinical Trial
     * Processor).
     *
     * @param BSN                         The "Burger Service Nummer" of the patient,
     * 
     * @param realm                       The Realm, which defines the TraIT "target collection" of patients.
     * 
     * @param clientKeyStoreProperties    A (relative or absolute) filename to the properties file that refers to the key store
     *                                    (which would be part of the resources directory e.g. the class path of the runtime??)
     *                                    
     * @param aliasForKey                 The alias for the key you wish to use; it is an identifier that you can find by invoking
     *                                    {@code keytool -list -keystore keystore.jks}, which lists all available keys and their
     *                                    names.
     *                       
     * @throws FileNotFoundException      Will be thrown when the key store properties file cannot be found.
     * 
     * @throws AccessDeniedException      ...
     *  
     * @throws DataValidationException    ...
     *  
     * @throws InternalError              ...
     *  
     * @throws MalformedURLException      ...
     */

    public List<String> getPseudonymForBSN(String BSN,
    									   String realm,
			      			               String clientKeyStoreProperties,
			      			               String aliasForKey)

	    throws FileNotFoundException, MalformedURLException, InternalError, DataValidationException, AccessDeniedException
    {
	  // Get the configuration file, allow absolute and relative paths

	    File file = new File(clientKeyStoreProperties);

	    if (!file.exists())
	    {
	    	throw new FileNotFoundException(clientKeyStoreProperties);
	    }

	    setKeyConfig("file:///" + file.getAbsolutePath());
		setKeyName(aliasForKey);
			
		PseudonymizationResponse response = doRequest(BSN, realm);
			
		ArrayList<String> pseudonyms = new ArrayList<String>();
		
	// The loop here implies that multiple pseudonyms can be returned? ...
		
		for (WsLinkedPseudonym pseudonym : response.getLinkedPseudonym())
		{
			pseudonyms.add(pseudonym.getValue());
		}
		
		return pseudonyms;
    }

    /**
     * this class, together with all its dependencies, is currently intended to be bundled in a single .jar file. It is to be
     * used with a (currently) non-Spring application. For simplicity's sake (and testing purposes), a static application context
     * will be created in a static initializer block...
     */

    static ApplicationContext applicationContext;
    
    static
    {
    	applicationContext = new GenericXmlApplicationContext("resources/cxf-beans.xml");
    	
    	/* TODO :: but it won't be properly closed this way, if you include the class in another program that doesn't use the
    	   static main function in this class... */
    }

    static public PseudonymizationClient getClient()
    {
    	return (PseudonymizationClient) applicationContext.getBean("client");
    }

    /**
     * Sample main method
     *
     * An example invocation (assuming that {@code ./PseudonymizationClient} is a small shell script that calls java with the
     * proper classpath) that should work is:
     * 
     * {@code ./PseudonymizationClient 123212321 targetCollection1 src/main/resources/resources/clientKeystore.properties submittingsite1service}
     *
     * @param args
     */
        
    
	public static void main(String[] args)
	{
		/*
		if (args.length < 1)
		{
			System.exit(0);
		}
		
		URL wsdl = null;
		try {
			wsdl = new URL(args[0]);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        System.out.println(wsdl.getFile());

        if (new File(wsdl.getFile()).isFile())
        {
            System.out.println("Your file exists!");
        }
        else
        {
            System.out.println("Your file does *NOT* exist!");
        }
        
		System.exit(0); */ 
		
		if(args.length  != 4)
		{
			System.out.println("Required arguments: BSN Realm keystore_config key_alias");

			return;
		}
		
		PseudonymizationClient client = getClient();

		try
		{
			List<String> pseudonyms = client.getPseudonymForBSN(args[0], args[1], args[2], args[3]);
			
			System.out.printf("%d pseudonym(s)...\n\n", pseudonyms.size());
			
			for (String pseudonym : pseudonyms)
			{
				System.out.printf(" - %s\n", pseudonym);
			}
		}
		catch (InternalError e)
		{
			e.printStackTrace();
		}
		catch (DataValidationException e)
		{
			e.printStackTrace();
		}
		catch (AccessDeniedException e)
		{
			e.printStackTrace();
		}
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}

		((AbstractApplicationContext) applicationContext).close();
	}
}
