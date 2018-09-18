package ru.yarsu.lab2;

public class OperationFactory {

    public static Operation getOperation(String operationArgument, SimpleNumber operand1, SimpleNumber operand2) {
        if("+".equals(operationArgument)){
            return new OperationPlus(operand1, operand2);
        }
        if("-".equals(operationArgument)){
            return new OperationMinus(operand1, operand2);
        }

        throw new UnsupportedOperationException("Не определенная функция");
    }
}
