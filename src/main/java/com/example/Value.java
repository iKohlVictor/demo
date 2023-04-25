package com.example;

public class Value {
    private int valueInteger;
    private double valueDecimal;
    private String valueIdentification;

    public int getValueInteger() {
        return valueInteger;
    }
    public void setValueInteger(int valueInteger) {
        this.valueInteger = valueInteger;
    }
    public double getValueDecimal() {
        return valueDecimal;
    }
    public void setValueDecimal(double valueDecimal) {
        this.valueDecimal = valueDecimal;
    }
    public String getValueIdentification() {
        return valueIdentification;
    }
    public void setValueIdentification(String valueIdentification) {
        this.valueIdentification = valueIdentification;
    }

     @Override
    public String toString() {
        return "Value [ valueInteger..: " + valueInteger + ", valueDecimal..: " + valueDecimal + ", valueIdentification..: "
                + valueIdentification + " ]";
    }
}
