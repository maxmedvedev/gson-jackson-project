package ux.test.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.util.List;

public class TypeUtil {
    public static <T> CollectionType getCollectionType(ObjectMapper objectMapper, Class<T> itemClazz) {
        CollectionType valueType = objectMapper.getTypeFactory().constructCollectionType(List.class, itemClazz);
        return valueType;
    }
}
