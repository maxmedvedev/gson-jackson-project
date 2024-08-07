package ux.test.impl;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Jackson implementation
 */
public class JsonLibrary {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public String convertToJson(Object obj) throws IOException {
        return objectMapper.writeValueAsString(obj);
    }

    public <T> T convertFromJson(String json, Class<T> clazz) throws IOException {
        return objectMapper.readValue(json, clazz);
    }
}
