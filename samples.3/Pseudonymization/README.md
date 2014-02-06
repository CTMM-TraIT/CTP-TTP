Custodix TTP Dicom Pseudonymization plugin for the CTP
======================================================

This directory contains a Clinical Trial Processor (CTP) plugin so that the CTP
becomes able to use the Custodix TTP for properly pseudonymizing patient
identifiers for research trials.

Compiling and installing it
---------------------------

The `mvn compile` and `mvn package` yield a `target` directory that contains
the actual jar file (and its dependencies in the `target/dependency-jars`).
Note, however, that the `target/dependency-jars/ctplib-1.0.jar` should **NOT**
be copied to the `library` directory of the CTP: this jar is the ("mavenized") 
`CTP.jar` file which should already a part of the CTP. Adding it twice (albeit
with a different jar name) seems very unwise.

The `ConfigurationTemplates.xml` file could look like this:

```xml
<TemplateDefinitions>
  <Components>
    <Plugin>

      <attr name="name"
        required="yes"
         default="PseudonymizationCtpPlugin"/>

      <attr name="class"
        required="yes"
         default="com.custodix.PseudonymizationCtpPlugin"
        editable="no"/>

      <attr name="id"
        required="yes"
         default="ttpLookup"/>

      <attr name="root"
        required="yes"
         default="roots/PseudonymizationCtpPlugin"/>

    </Plugin>
  </Components>
</TemplateDefinitions>
```

An example CTP configuration file element could look like this:

```xml
<Plugin class="com.custodix.PseudonymizationCtpPlugin" />
```

