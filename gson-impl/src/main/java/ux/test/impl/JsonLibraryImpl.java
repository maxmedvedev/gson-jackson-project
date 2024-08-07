package ux.test.impl;

import com.google.gson.Gson;
import ux.test.JsonLibrary;

/**
 * Gson implementation
 */
public class JsonLibraryImpl implements JsonLibrary {
    private final Gson gson = new Gson();

    @Override
    public String convertToJson(Object obj) {
        return gson.toJson(obj);
    }

    @Override
    public <T> T convertFromJson(String json, Class<T> clazz) {
        return gson.fromJson(json, clazz);
    }
}
