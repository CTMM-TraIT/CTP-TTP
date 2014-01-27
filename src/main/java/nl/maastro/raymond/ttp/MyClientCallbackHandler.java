package nl.maastro.raymond.ttp;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class MyClientCallbackHandler implements CallbackHandler
{
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException
	{
		for (int i = 0; i < callbacks.length; i++)
		{
			if (callbacks[i] instanceof WSPasswordCallback)
			{
				WSPasswordCallback pc = (WSPasswordCallback) callbacks[i]; pc.setPassword(pc.getIdentifier());
			}
		}
	}
}
