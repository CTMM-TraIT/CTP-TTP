package com.custodix;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;


/**
 * Dummy password callbackhandler, assumes that the password equals the identifier, unless it is present in the entries map 
 * (for instance the STS certificate ciam-dev-trait.custodix.com)
 * Add additional keystore passwords to the entries map
 * @author Jelle
 *
 */
public class PasswordCallbackHandler implements CallbackHandler {

	private Map<String, String> entries = new HashMap<String, String>();
	
	public PasswordCallbackHandler() {
		entries.put("ciam-dev-trait.custodix.com", "changeit");
		entries.put("submittingsite1service","changeit");
	}
	
	@Override
	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		for(Callback cb : callbacks) {
			if(cb instanceof WSPasswordCallback) {
				if(entries.containsKey(((WSPasswordCallback) cb).getIdentifier())) {
					((WSPasswordCallback) cb).setPassword(entries.get(((WSPasswordCallback) cb).getIdentifier()));
					
				} else {
					((WSPasswordCallback) cb).setPassword(((WSPasswordCallback) cb).getIdentifier());
				}
				return;
			}
		}
	}

}
