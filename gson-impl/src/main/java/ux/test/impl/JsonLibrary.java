package ux.test.impl;

import com.google.gson.Gson;

/**
 * Gson implementation
 */
public class JsonLibrary {
    private final Gson gson = new Gson();

    public String convertToJson(Object obj) {
        return gson.toJson(obj);
    }

    public <T> T convertFromJson(String json, Class<T> clazz) {
        return gson.fromJson(json, clazz);
    }
}
