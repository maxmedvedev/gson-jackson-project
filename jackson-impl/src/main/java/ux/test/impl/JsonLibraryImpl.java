package ux.test.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import ux.test.JsonLibrary;

import java.io.IOException;

/**
 * Jackson implementation
 */
public class JsonLibraryImpl implements JsonLibrary {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToJson(Object obj) throws IOException {
        return objectMapper.writeValueAsString(obj);
    }

    @Override
    public <T> T convertFromJson(String json, Class<T> clazz) throws IOException {
        return objectMapper.readValue(json, clazz);
    }
}
