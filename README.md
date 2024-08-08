# gson-jackson-project

A simple project to mess with shared sources in Gradle.

There are several modules in the project:
- `:api` module contains the API for working with JSON
- `:gson-lib` implements the API with the help of the Gson library
- `:jackson-lib` implements the API with the help of the Jackson library
- `:gson-app` is an app target that runs Simple app with Gson implementation  
- `:jackson-app` is an app target that runs Simple app with Jackson implementation
- `shared-sources` folder contains the sources of the Simple app. It is shared between both `:*-app` modules. 
  Note that the folder is not a separate module. it is included in the app modules as a source set, 
  so it is compiled as part of them. Moreover, it does not know which `JsonLibrary` class it uses. 