package ru.yarsu.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OperationTest {

    @Test
    void testOperationPlusEval() {
        Operation operation = new OperationPlus(new SimpleNumber("12"), new SimpleNumber("15"));
        assertEquals(operation.evaluate(), new Integer(27));
    }

    @Test
    void testFactoryOperationPlusCreation(){
        Operation operation = OperationFactory.getOperation("+", new SimpleNumber("12"), new SimpleNumber("15"));
        assertEquals(operation.getClass(), OperationPlus.class);
    }

}