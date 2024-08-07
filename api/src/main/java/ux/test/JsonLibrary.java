package ux.test;

import java.io.IOException;

public interface JsonLibrary {
    String convertToJson(Object obj) throws IOException;

    <T> T convertFromJson(String json, Class<T> clazz) throws IOException;
}