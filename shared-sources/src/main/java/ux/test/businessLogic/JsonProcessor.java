package ux.test.businessLogic;

import ux.test.JsonLibrary;

import java.io.IOException;

public class JsonProcessor {
    private final JsonLibrary jsonLibrary;

    public JsonProcessor(JsonLibrary jsonLibrary) {
        this.jsonLibrary = jsonLibrary;
    }

    public String convertObjectToJson(Object obj) throws IOException {
        return jsonLibrary.convertToJson(obj);
    }

    public <T> T convertJsonToObject(String json, Class<T> clazz) throws IOException {
        return jsonLibrary.convertFromJson(json, clazz);
    }
}


