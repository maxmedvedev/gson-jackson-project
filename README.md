# gson-jackson-project

A simple project to mess with shared sources in Gradle.

There are several modules in the project:
- `:api` module contains the API for working with JSON
- `:gson-impl` implements the API with the help of the Gson library
- `:jackson-impl` implements the API with the help of the Jackson library
- `:app-gson` is an app target that runs Simple app with Gson implementation  
- `:app-jackson` is an app target that runs Simple app with Jackson implementation
- `shared-sources` folder contains the sources of the Simple app. It is shared between both `:app-*` targets. 
  Note that it is not a separate module. The folder is included in the app modules as a source set, 
  so it is compiled independently for both targets. Moreover, it does not know which `JsonLibraryImpl` class it uses.
  This class exists ib both `:*-impl` modules.  