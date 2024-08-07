package ux.test.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class TypeUtil {

    public static <T> Type listOf(Class<T> elementType) {
        return new ParameterizedTypeImpl(List.class, elementType);
    }

    private static class ParameterizedTypeImpl implements ParameterizedType {
        private final Type rawType;
        private final Type[] typeArguments;

        public ParameterizedTypeImpl(Type rawType, Type... typeArguments) {
            this.rawType = rawType;
            this.typeArguments = typeArguments;
        }

        @Override
        public Type[] getActualTypeArguments() {
            return typeArguments;
        }

        @Override
        public Type getRawType() {
            return rawType;
        }

        @Override
        public Type getOwnerType() {
            return null;
        }
    }
}