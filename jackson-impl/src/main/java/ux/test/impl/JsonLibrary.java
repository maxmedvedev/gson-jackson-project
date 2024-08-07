package ux.test.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.io.IOException;
import java.util.List;

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

    public <T> List<T> convertFromJsonToList(String json, Class<T> itemClass) throws IOException {
        CollectionType valueType = objectMapper.getTypeFactory().constructCollectionType(List.class, itemClass);
        return objectMapper.readValue(json, valueType);
    }
}
