This is the TTPtools project, which is mostly a prototype/concept project to
see how the Custodix STS (and PIMS) works. Practical tooling may come out of
it, hence its name.

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
