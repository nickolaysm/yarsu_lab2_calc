package ru.yarsu.lab2;

public class SimpleNumber {

    private Integer value;

    public SimpleNumber(String parameter){
        value = Integer.valueOf(parameter);
    }

    public Integer getValue(){
        return value;
    }
}
