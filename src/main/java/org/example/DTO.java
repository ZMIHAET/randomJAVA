package org.example;

public class DTO {
    private String stringField;
    private int intField;
    private double doubleField;
    private boolean booleanField;
    private char charField;
    private byte byteField;
    private short shortField;
    private long longField;
    private float floatField;
    public DTO() {
    }

    public DTO (String stringField, int intField, boolean booleanField, char charField, double doubleField, byte byteField, short shortField, long longField, float floatField){
        this.booleanField = booleanField;
        this.stringField = stringField;
        this.intField = intField;
        this.charField = charField;
        this.doubleField = doubleField;
        this.byteField = byteField;
        this.shortField = shortField;
        this.longField = longField;
        this.floatField = floatField;
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
    public byte getByteField(){
        return byteField;
    }
    public short getShortField(){
        return shortField;
    }
    public long getLongField(){
        return longField;
    }
    public float getFloatField(){
        return floatField;
    }
}
