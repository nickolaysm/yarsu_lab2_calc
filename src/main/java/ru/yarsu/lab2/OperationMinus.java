package ru.yarsu.lab2;

public class OperationMinus extends Operation {

    public OperationMinus(SimpleNumber operand1, SimpleNumber operand2) {
        super(operand1, operand2);
    }

    public Integer evaluate(){
        return operand1.getValue() - operand2.getValue();
    }
}
