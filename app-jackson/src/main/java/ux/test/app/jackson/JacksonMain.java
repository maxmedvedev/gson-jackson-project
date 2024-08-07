package ux.test.app.jackson;

import ux.test.app.App;

public class JacksonMain {
    public static void main(String[] args) {
        App app = new App();

        System.out.println("Stating Jackson serialization app");
        app.run();
        System.out.println("Finishing Jackson serialization app");
    }

}
