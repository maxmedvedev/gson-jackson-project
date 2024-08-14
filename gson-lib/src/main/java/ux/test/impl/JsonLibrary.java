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
        // TODO This method does not process items of a list correctly.
        //      To make it work, you need to pass an instance of `Type` to `readValue` instead of `clazz`:
        //      ```
        //      Type collectionType = TypeUtil.listOf(itemClass);
        //      gson.fromJson(json, collectionType);
        //      ```
        return gson.fromJson(json, clazz);
    }
}
