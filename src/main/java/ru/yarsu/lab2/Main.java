package ru.yarsu.lab2;

public class Main {

    public static void main(String[] args) {
        System.out.println(
                OperationFactory.getOperation(
                        args[1],
                        new SimpleNumber(args[0]),
                        new SimpleNumber(args[2]) )
                .evaluate()
        );
    }
}
