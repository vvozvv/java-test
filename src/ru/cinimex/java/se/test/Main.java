package ru.cinimex.java.se.test;

import ru.cinimex.java.se.test.entity.OperationType;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        OperationType oType = new OperationType(1L, "Plus", 10);
        OperationType oType2 = new OperationType(2L, "Minus", 20);
//        oType.operationTypeName = "Plus";
        oType.printInfo();
        oType2.printInfo();
    }
}
