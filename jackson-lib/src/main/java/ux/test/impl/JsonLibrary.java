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
        // TODO This method does not process items of a list correctly.
        //      To make it work, you need to pass an instance of CollectionType to `readValue` instead of `clazz`:
        //      ```
        //      CollectionType collectionType = TypeUtil.getCollectionType(objectMapper, itemClass);
        //      return objectMapper.readValue(json, collectionType);
        //      ```

        return objectMapper.readValue(json, clazz);
    }
}
