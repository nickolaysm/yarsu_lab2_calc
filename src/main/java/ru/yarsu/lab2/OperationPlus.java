package ru.yarsu.lab2;

public class OperationPlus extends Operation {

    public OperationPlus(SimpleNumber operand1, SimpleNumber operand2) {
        super(operand1, operand2);
    }

    public Integer evaluate(){
        return operand1.getValue() + operand2.getValue();
    }
}
