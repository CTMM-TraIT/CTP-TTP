Custodix TTP Dicom Pseudonymization plugin for the CTP
======================================================

This directory contains a Clinical Trial Processor (CTP) plugin so that the CTP
becomes able to use the Custodix TTP for properly pseudonymizing patient
identifiers for research trials.

Compiling it
------------

The `mvn compile` and `mvn package` commands, when executed in this project root
directory, yields a `target/` directory that contains the
`PseudonymizationSample-1.0-SNAPSHOT.jar` file; its dependencies are
conveniently copied to the `target/dependency-jars` directory.

Installing it
-------------

Copy `PseudonymizationSample-1.0-SNAPSHOT.jar` to the `libraries` directory of
the CTP installation directory. Then, copy most (but **not all**) files from
the `target/dependency-jars` directory to the `libraries` directory of
the CTP installation directory as well. The files you **must** skip are...

  *  `target/dependency-jars/ctplib-1.0.jar` (This is a "mavenized" copy of
     the `CTP.jar` file which should already a part of the CTP. Adding it twice
     (albeit with a different jar name) seems very unwise.

  *  `target/dependency-jars/log4j-1.2.17.jar` (Log4j is already included in
     the CTP),

  *  `target/dependency-jars/slf4j-api-1.6.1.jar` (already included in the CTP)

Using it
--------

Add the following directive to your `config.xml` file that drives your CTP
pipeline:

```xml
<Plugin class="com.custodix.PseudonymizationCtpPlugin" />
```

In the "*DICOM Anonymizer*"-section of the web GUI, 

@call(ttpLookup)

The "signature" of the call is...

```
@call(ttpLookup,source,realm,aliasForKey)
```

The first argument is the name of this plugin (`ttpLookup`). The second argument
denotes the *source* of the patient identifier. This could be `PatientID` (or
`this`, if you attempt to process `[0010,0020] PatientID`). The 3rd and 4th
arguments are Custodix TTP account specific: the *realm* is the name (or
identifier) for the collection (or group) of patient identifiers you wish to
pseudonymize (input that worked for Maastro Clinic is `targetCollection1`').
The "*alias for key*" is more or less the name of the account that creates the
pseudonimized aliases for you in the first place (an example that worked
for Maastro Clinic is `submittingsite1service`).




@param(@SHORTNAME).@call(ttpLookup(PatientID,targetCollection1,submittingsite1service)
