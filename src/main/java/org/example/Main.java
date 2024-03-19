package org.example;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        RandomDtoGenerator generator = new RandomDtoGenerator();
        DTO randomDto = generator.generateDto(DTO.class);

        System.out.println(randomDto.getStringField());
        System.out.println(randomDto.getIntField());
        System.out.println(randomDto.getDoubleField());
        System.out.println(randomDto.isBooleanField());
        System.out.println(randomDto.getCharField());
    }
}