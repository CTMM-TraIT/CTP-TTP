This is the TTPtools project, which is mostly a prototype/concept project to
see how the Custodix STS (and PIMS) works. Practical tooling may come out of
it, hence its name. This project also retains must (if not all) 3rd party
documentation relevant for the development of this project (in doc.3/).

This project currently depends on Apache CXF (for SOAP/XML client
functionality), Spring Framework and the Groovy scripting language (which is
used in the Custodix Technical Specifications (v3) for calculating 'target
identifiers'.

Note that this project is intended to be developed in a UNIX'ish environment:
all *auxiliary* scripts are bash scripts that are poised to work in Cygwin and
in a normal UNIX environment.

You can build and run it with Maven inside your cloned directory:

  -  "mvn package" will yield a "${basedir}/target/"-directory with all the
     relevant .jar files (in "${basedir}/target/dependency-jars").

  -  The "runner" shell script (which uses 'common.sh') is primarily used
     for creating symlinks that represent class names in the
     "nl.maastro.raymond.ttp"-namespace.

     The symlink named 'Test', for instance, will run the static main function
     of class nl.maastro.raymond.ttp.Test (after a succesful 'mvn package'!)

Some things to consider when you want to browse/edit with the Eclipse IDE:

  -  It is best/easiest to clone the TTPtools in your Eclipse Workspace. Then
     you can import it (File --> Import --> Existing Maven Projects).

  -  the wsdl/ directory contains WSDL files that must be converted into
     actual Java code: this conversion can be done with the 'generate-sources'
     Maven target.

     You need to execute this target in order to have a complete
     "source picture" as far as method/class resolving is concerned, since
     this generated code is **not** part of the git repository (only the
     source WSDL's are).

     Keep this in mind while importing; perhaps this will give you problems
     (when you import a clone without the 'wsdl2java' directory...)
