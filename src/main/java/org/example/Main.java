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

        System.out.println("Рандомная строка: " + randomDto.getStringField());
        System.out.println("Рандомный Integer: " + randomDto.getIntField());
        System.out.println("Рандомный Long: " + randomDto.getLongField());
        System.out.println("Рандомный Short: " + randomDto.getShortField());
        System.out.println("Рандомный Byte: " + randomDto.getByteField());
        System.out.println("Рандомный Float: " + randomDto.getFloatField());
        System.out.println("Рандомный Double: " + randomDto.getDoubleField());
        System.out.println("Рандомный Boolean: " + randomDto.isBooleanField());
        System.out.println("Рандомный Char: " + randomDto.getCharField());

    }
}