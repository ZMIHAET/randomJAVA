package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class RandomDtoGenerator {

    private final Random random;
    private static final int leftLimitSTR = 97; // letter 'a'
    private static final int rightLimitSTR = 122; // letter 'z'
    private static final int targetStringLength = 10;
    private static final int leftLimitCHAR = 32; // первый печатный символ ASCII (пробел имеет код 32)
    private static final int rightLimitCHAR = 126; // последний печатный символ ASCII
    public RandomDtoGenerator() {
        this.random = new Random();
    }

    public <T> T generateDto(Class<T> dtoClass) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Constructor<T> constructor = dtoClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        T dto = constructor.newInstance();

        for (Field field : dtoClass.getDeclaredFields()) {
            field.setAccessible(true);
            Class<?> fieldType = field.getType();
            if (fieldType.equals(String.class)) {
                field.set(dto, generateRandomString());
            } else if (fieldType.equals(int.class) || fieldType.equals(Integer.class)) {
                field.set(dto, random.nextInt());
            } else if (fieldType.equals(boolean.class) || fieldType.equals(Boolean.class)) {
                field.set(dto, random.nextBoolean());
            } else if (fieldType.equals(char.class)){
                field.set(dto, generateRandomChar());
            } else if (fieldType.equals(double.class) || fieldType.equals(Double.class)){
                field.set(dto, random.nextDouble());
            } else if (fieldType.equals(byte.class) || fieldType.equals(Byte.class)){
                byte randomByte = (byte) random.nextInt(Byte.MIN_VALUE, Byte.MAX_VALUE + 1);
                field.set(dto, randomByte);
            } else if (fieldType.equals(short.class) || fieldType.equals(Short.class)){
                short randomShort = (short) random.nextInt(Short.MIN_VALUE, Short.MAX_VALUE + 1);
                field.set(dto, randomShort);
            } else if (fieldType.equals(long.class) || fieldType.equals(Long.class)){
                field.set(dto, random.nextLong());
            } else if (fieldType.equals(float.class) || fieldType.equals(Float.class)){
                field.set(dto, random.nextFloat());
            }

        }
        return dto;
    }


    private String generateRandomString() {
        return random.ints(leftLimitSTR, rightLimitSTR + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
    private char generateRandomChar() {
        // Генерируем случайное число, соответствующее ASCII коду символа в диапазоне от leftLimit до rightLimit
        int randomAscii = random.nextInt(rightLimitCHAR - leftLimitCHAR + 1) + leftLimitCHAR;

        return (char) randomAscii;
    }

}

