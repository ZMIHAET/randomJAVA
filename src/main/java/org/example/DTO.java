package org.example;

public class DTO {
    private String stringField;
    private int intField;
    private double doubleField;
    private boolean booleanField;
    private char charField;
    public DTO() {
    }

    public DTO (String stringField, int intField, boolean booleanField, char charField, double doubleField){
        this.booleanField = booleanField;
        this.stringField = stringField;
        this.intField = intField;
        this.charField = charField;
        this.doubleField = doubleField;
    }

    public String getStringField(){
        return stringField;
    }
    public int getIntField(){
        return intField;
    }
    public boolean isBooleanField(){
        return booleanField;
    }
    public char getCharField(){
        return charField;
    }
    public double getDoubleField(){
        return doubleField;
    }
}
