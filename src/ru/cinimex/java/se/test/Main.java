package ru.cinimex.java.se.test;

import ru.cinimex.java.se.test.entity.OperationType;
import ru.cinimex.java.se.test.entity.OperationTypeCode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] newArray = new int[10][10];
        System.out.println("Hello world");

        // lesson 3.
        OperationType oType = new OperationType(1L);
        OperationType oType2 = new OperationType(2L, "Minus", 20, OperationTypeCode.JAVA);
        oType.addOrderIndex(9, true);
        oType2.addOrderIndex(19, false);

        // lesson 2.
        oType.printInfo();
        oType2.printInfo();

        // lesson 4.
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = (int) (1 + Math.random() * 100);
            }
        }

        for (int[] anArr : newArray) {
            Arrays.sort(anArr);
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
    }
}
