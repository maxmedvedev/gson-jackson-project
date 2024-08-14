# gson-jackson-project

A simple project to mess with shared sources in Gradle.

There are several modules in the project:
- `:gson-lib` implements a JSON API with the help of the Gson library
- `:jackson-lib` implements a JSON API with the help of the Jackson library
- `:gson-app` is an app target that runs an simple app with the Gson implementation  
- `:jackson-app` is an app target that runs a simple app with the Jackson implementation
- `shared-sources` folder contains the sources of the app. It is shared between both `:*-app` modules. 
  Note that the folder is not a separate module. it is included in the app modules as a source set, 
  so it is compiled as part of them. Moreover, it does not know which `JsonLibrary` class it uses. 