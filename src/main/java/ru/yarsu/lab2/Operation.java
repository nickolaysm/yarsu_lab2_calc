package ru.yarsu.lab2;

import ru.yarsu.lab2.SimpleNumber;

public class Operation {

    protected SimpleNumber operand1;

    protected SimpleNumber operand2;

    public Operation(SimpleNumber operand1, SimpleNumber operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public Integer evaluate(){
        throw new UnsupportedOperationException();
    }

}
