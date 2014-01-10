package nl.maastro.raymond.ttp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    public static void main(String args[])
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/cxf.xml");

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
