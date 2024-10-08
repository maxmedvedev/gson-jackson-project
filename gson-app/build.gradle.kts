/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("buildlogic.java-application-conventions")
}

dependencies {
    implementation(project(":gson-lib"))
}

application {
    // Define the main class for the application.
    mainClass = "org.example.app.App"
}

sourceSets {
    main {
        java {
            srcDir("../shared-sources/src/main/java")
        }
    }
}
