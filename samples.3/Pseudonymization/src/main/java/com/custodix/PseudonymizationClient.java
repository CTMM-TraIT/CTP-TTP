package com.custodix;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
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
 * <p>
 * This program began its life as a sample implementation of a <i>pseudonymization client</i>, which can be used to get a pseudonym
 * by using a BSN ("civilian service number") as an identifier. The {@code PseudonymizationClient} class can also be incorporated
 * in other programs (like the CTP, the Clinical Trial Processor) for requesting pseudonyms as well.
 * </p>
 * <p>
 * Using this code, stand-alone or incorporated in a larger program, requires a "{@code ttpConfig}" configuration directory which
 * is expected to be present in the current working directory (e.g. the installation directory of your program). This directory is
 * expected to contain the following four files:
 * <ul>
 *   <li>
 *     A <i>Java Key Store</i> ({@code .jks}) file, which could be named {@code store.jks}, which retains a private key (and
 *     client certificate) for access to the Custodix TTP in general.
 *   </li>
 *   <li>
 *     A <i>Java Key Store</i> ({@code .jks}) file, is expected to be named {@code idp.jks}, which retains credentials related to
 *     STS access (is this so? This file was provided by us in the example; before receiving this example, I was not explicitly
 *     aware that I needed this secondary key store though its accompanying properties file was mentioned in the documentation)
 *   </li>
 *   <li>
 *     A file named {@code clientKeystore.properties}, which is expected to contain the following properties:
 *     <ul>
 *       <li>
 *         {@code org.apache.ws.security.crypto.merlin.keystore.file}, which must refer to the <i>Java Key Store</i> ({@code .jks})
 *         that retains a private key (and client certificate) for access to the Custodix TTP in general. Note that the value
 *         of this property is expected to be a relative path that starts with "{@code ttpConfig/}"; an example value for this
 *         property would be "{@code ttpConfig/store.jks}",
 *       </li>
 *       <li>
 *         {@code org.apache.ws.security.crypto.merlin.keystore.password}, which must refer to the password that protects the
 *         key store referred to with {@code org.apache.ws.security.crypto.merlin.keystore.file},
 *       </li>
 *       <li>
 *         {@code org.apache.ws.security.crypto.merlin.keystore.type}, which is expected to be set to "{@code jks}"; it signifies
 *         the keystore type,
 *       </li>
 *       <li>
 *         {@code org.apache.ws.security.crypto.merlin.keystore.alias}, which must be set to the (account?) name of the
 *         service; an example value for this property would be "{@code submittingsite1service}".
 *       </li>
 *     </ul>
 *   </li>
 *   <li>
 *     A file named {@code stsKeystore.properties}, similar to the previously discussed properties file, which is expected to
 *     (similarly) contain the following properties:
 *     <ul>
 *       <li>
 *         {@code org.apache.ws.security.crypto.merlin.keystore.file}, which is expected to refer to "{@code ttpConfig/idp.jks}",
 *       </li>
 *       <li>
 *         {@code org.apache.ws.security.crypto.merlin.keystore.password}, which must refer to the password that protects the
 *         "{@code ttpConfig/idp.jks}" key store,
 *       </li>
 *       <li>
 *         {@code org.apache.ws.security.crypto.merlin.keystore.type}, which is expected to be set to "{@code jks}"; it signifies
 *         the keystore type,
 *       </li>
 *       <li>
 *         {@code org.apache.ws.security.crypto.merlin.keystore.alias}, which is expected to be set to
 *         "{@code ciam-dev-trait.custodix.com}". 
 *       </li>
 *     </ul>
 *   </li>
 * </ul>
 * </p>
 * 
 * @author Jelle (original version)
 * @author Raymond Dresens (altered version, some documentation & notes)
 *
 */
public class PseudonymizationClient
{	
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
    
    static
    {
        URL url = null;
        
        try
        {
            url = new URL("https://pims-dev-trait.custodix.com/pims/services/PseudonymizationService?wsdl");
        }
        catch (MalformedURLException e)
        {
            java.util.logging.Logger.getLogger(PseudonymizationClient.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", ENDPOINT);
        }

        WSDL_LOCATION = url;
    }
    
    
    public String getPassword() { return password; }
    public   void setPassword(String password) { this.password = password; }
    
    public String getUserName() { return userName; }
    public   void setUserName(String userName) { this.userName = userName; }
    
    public String getKeyConfig() { return keyConfig; }
    public   void setKeyConfig(String keyConfig) { this.keyConfig = keyConfig; }

    public String getKeyName() { return keyName; }
    public   void setKeyName(String keyName) { this.keyName = keyName; }
    
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

    static private HashMap<String, CachedPseudonyms> pseudonymCache;
    
    static
    {
    	pseudonymCache = new HashMap<String, CachedPseudonyms>();
    }

    public static void clearPseudonymCache()
    {
    	pseudonymCache.clear();
    }

    /**
     * This small class allows us to cache pseudonyms returned from the Custodix TTP based on "time stamps". The general idea
     * is that we wrap the list of pseudonyms together with a time stamp e.g. age of the pseudonyms... though you could wonder
     * whether such a lifespan is really neccesary (shouldn't pseudonyms always remain the same?) 
     * 
     * @author raymond.dresens
     */

    public class CachedPseudonyms
    {
    	private GregorianCalendar timestamp;
    	
    	private List<String> pseudonyms;


    	CachedPseudonyms(List<String> pseudonyms)
    	{
    		timestamp = new GregorianCalendar(); this.pseudonyms = pseudonyms;
    	}


    	boolean tooOld()
    	{
    		GregorianCalendar now = new GregorianCalendar();
    		
    		now.add(Calendar.MINUTE, -10); return timestamp.before(now);	
    	}

    	
    	int numberOfPseudonyms()
    	{
    		return pseudonyms.size();
    	}


    	String getFirstPseudonym()
    	{
    		return pseudonyms.get(0);
    	}
    	
    	
    	List<String> getPseudonyms()
    	{
    		return Collections.unmodifiableList(pseudonyms);
    	}
    }
    
    static int pseudonymInvocationCounter = 0;
    
    static final String keystorePropertiesFile = "ttpConfig/clientKeystore.properties";
    /**
     * This method was created so that this sample can be easily hooked into other programs (like the CTP, the Clinical Trial
     * Processor). Note that this method uses a pseudonym cache.
     *
     * @param BSN                         The "Burger Service Nummer" of the patient,
     * 
     * @param realm                       The Realm, which defines the TraIT "target collection" of patients.
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
			      			               String aliasForKey)

	    throws FileNotFoundException, MalformedURLException, InternalError, DataValidationException, AccessDeniedException
    {
    	pseudonymInvocationCounter++;
    	
    	if (pseudonymInvocationCounter == 100)
    	{
    		pseudonymInvocationCounter = 0;
    		
    		for (String cachedBSN : pseudonymCache.keySet())
    		{
    			if (pseudonymCache.get(cachedBSN).tooOld())
    			{
    				pseudonymCache.remove(cachedBSN);
    			}
    		}
    	}
    	
    	if (pseudonymCache.containsKey(BSN))
    	{
    		CachedPseudonyms cachedPseudonyms = pseudonymCache.get(BSN);
    		
    		if (!cachedPseudonyms.tooOld())
    		{
    			return cachedPseudonyms.getPseudonyms();
    		}
    		else
    		{
    			pseudonymCache.remove(BSN);
    		}
    	}

    // Get the configuration file, allow absolute and relative paths

	    File file = new File(keystorePropertiesFile);

	    if (!file.exists())
	    {
	    	throw new FileNotFoundException(keystorePropertiesFile);
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

		pseudonymCache.put(BSN, new CachedPseudonyms(pseudonyms));
		
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
     * {@code ./PseudonymizationClient 123212321 targetCollection1 submittingsite1service}
     *
     * @param args
     */
        
    
	public static void main(String[] args)
	{		
		if(args.length  != 3)
		{
			System.out.println("Required arguments: BSN Realm key_alias");

			return;
		}
		
		PseudonymizationClient client = getClient();

		try
		{
			List<String> pseudonyms = client.getPseudonymForBSN(args[0], args[1], args[2]);
			
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
