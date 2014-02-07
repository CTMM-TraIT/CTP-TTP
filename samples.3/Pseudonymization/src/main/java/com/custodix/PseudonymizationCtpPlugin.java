package com.custodix;

import java.util.List;

import org.apache.log4j.Logger;

import org.rsna.ctp.plugin.AbstractPlugin;
import org.rsna.ctp.stdstages.anonymizer.dicom.AnonymizerExtension;
import org.rsna.ctp.stdstages.anonymizer.dicom.FnCall;
import org.w3c.dom.Element;

public class PseudonymizationCtpPlugin extends AbstractPlugin implements AnonymizerExtension
{
	static final Logger logger = Logger.getLogger(PseudonymizationCtpPlugin.class);

	public PseudonymizationCtpPlugin(Element element)
	{
		super(element);
	}

	@Override public String call(FnCall fn) throws Exception
	{
		if (fn.args.length < 4)
		{
			throw new Exception("!quarantine! - too few arguments provided to ttpLookup\n");
		}

     // logger.warn("'" + fn.args[1] + "' => '" + fn.context.contents(fn.args[1].trim(), fn.thisTag) + "'");

		String BSN         = fn.context.contents(fn.args[1].trim(), fn.thisTag);
		String realm       = fn.args[2].trim();
		String aliasForKey = fn.args[3].trim();

		logger.info(String.format("Pseudonymizing '%s' for realm '%s', aliasForKey '%s'", BSN, realm, aliasForKey));		
		
		try
		{
			PseudonymizationClient client = PseudonymizationClient.getClient();

			List<String> pseudonyms = client.getPseudonymForBSN(BSN, realm, aliasForKey);

			if (pseudonyms.size() != 1)
			{
			    logger.warn(String.format("Expected 1 pseudonym, but got %d", pseudonyms.size()));
			}

			return pseudonyms.get(0);
		}
		catch (Exception e)
		{
			logger.error(e); throw new Exception("!quarantine! - pseudonymisation exception\n");
		}
	}
}
