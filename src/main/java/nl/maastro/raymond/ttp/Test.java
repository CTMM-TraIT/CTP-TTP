package nl.maastro.raymond.ttp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.custodix.mpi._1.PseudonymizationRequest;
import com.custodix.mpi._1.PseudonymizationResponse;
import com.custodix.mpi._1_0.AccessDeniedException;
import com.custodix.mpi._1_0.DataValidationException;
import com.custodix.mpi._1_0.InternalError;
import com.custodix.mpi._1_0.PseudonymizationService_Service;
import com.custodix.mpi._1_0.PseudonymizationService;

public class Test
{
    public static void main(String args[])
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/cxf.xml");

    	PseudonymizationService_Service service = new PseudonymizationService_Service();

    	PseudonymizationService port = service.getPseudonymizationServicePort();

    	PseudonymizationRequest myRequest = new PseudonymizationRequest(); 
    	
    	try
    	{
			PseudonymizationResponse response = port.requestPseudonyms(myRequest);
			
		}
    	catch (DataValidationException | InternalError | AccessDeniedException e1)
		{
			// TODO Auto-generated catch block

			e1.printStackTrace();
		}
    	
    	try
    	{
	        /* ... */
    	}
    	catch (Exception e)
    	{
    		e.printStackTrace();
    	}
    	finally
    	{
    		((AbstractApplicationContext) applicationContext).close();
    	}    	
    }
}
