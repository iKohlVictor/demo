package com.example;

public class Token {
    private TokenEnum tokenEnum;
    private Value value;

    public TokenEnum getTokenEnum() {
        return tokenEnum;
    }
    public void setTokenEnum(TokenEnum tokenEnum) {
        this.tokenEnum = tokenEnum;
    }
    public Value getValue() {
        return value;
    }
    public void setValue(Value value) {
        this.value = value;
    }

     @Override
    public String toString() {
        return "Token { tokenEnum..: " + tokenEnum + ", value..: " + value + " }";
    }
}
