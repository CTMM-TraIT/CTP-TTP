TTPTools: for dealing with the Custodix Trusted Third Party
===========================================================

This is the TTPtools project, which was first created by Raymond as a
prototype/concept project to see how the Custodix STS (and PIMS) works.
Practical tooling could come out of it, hence its name.

Custodix TTP Dicom Pseudonymization plugin for the CTP
------------------------------------------------------

It is likely that you are (mainly) looking for the Custodix TTP Dicom
Pseudonymization plugin for the CTP. This project includes it in
`samples.3/Pseudonymization`; this pseudonymization plugin is mostly based on
3rd party example code (provided by Custodix). This project is also intended to
retains most (if not all) 3rd party documentation relevant for the development
of this project (in `doc.3/`).

A small tour of the Playground (...or is it a Waste Dump?)
----------------------------------------------------------

Apart from `samples.3/Pseudonymization`), this repository contains mostly
unusable (and non-functioning) code; it is currently a *scrap heap* of
information related to CTP/TTP/Custodix. Efforts for understanding the
Custodix documentation (and Apache CXF, the dependency that enables SOAP/XML
client functionality) by implementing a client from scratch were eventually
diverted when we received a (working!) pseudonymization sample from Custodix.

Warning: (well, if there is any cause for concern, but now you know) this
repository actually contains Custodix access credentials to the
*testing infrastructure* of Custodix; credentials for production/live systems
should *never* be included in this repository.

Note that this project is originally developed in a UNIX'ish environment: all
*auxiliary* scripts are bash scripts that are poised to work in Cygwin and
in a normal UNIX environment.

You can build and run it with Maven inside your cloned directory:

  *  `mvn package` will yield a `${basedir}/target/`-directory with all the
     relevant `.jar` files (in `${basedir}/target/dependency-jars`).

  *  The `runner` shell script (which uses `common.sh`) is primarily used
     for creating symlinks that represent class names in the
     `nl.maastro.raymond.ttp`-namespace.

     The symlink named `Test`, for instance, will run the static main function
     of class `nl.maastro.raymond.ttp.Test` (after a succesful `mvn package`!)

Some things to consider when you want to browse/edit with the Eclipse IDE:

  *  It is best/easiest to clone the TTPtools in your Eclipse Workspace. Then
     you can import it (File --> Import --> Existing Maven Projects).

  *  the `wsdl/` directory contains WSDL files that must be converted into
     actual Java code: this conversion can be done with the `generate-sources`
     Maven target.

     You need to execute this target in order to have a complete
     "source picture" as far as method/class resolving is concerned, since
     this generated code is **not** part of the git repository (only the
     source WSDL's are).

     Keep this in mind while importing; perhaps this will give you problems
     (when you import a clone without the `wsdl2java`-directory...)
