
private-key.pfx:	store.jks
			echo "** use 'changeit' as passwords **"; keytool -importkeystore -srckeystore store.jks -srcalias submittingsite1service -destkeystore private-key.pfx -deststoretype PKCS12

private-key.pem:	private-key.pfx
			openssl pkcs12 -in private-key.pfx -nocerts -nodes -out private-key.pem

certificate.pem:	private-key.pfx
			openssl pkcs12 -in private-key.pfx -nokeys -out certificate.pem

certificate-ca.pfx:	store.jks
			echo "** use 'changeit' as passwords **"; keytool -importcert -srckeystore store.jks -srcalias 'trait test ca 2014' -destkeystore certificate-ca.pfx -deststoretype PKCS12

clean:
			rm -rf private-key.pfx private-key.pem certificate.pem certificate-ca.pfx
