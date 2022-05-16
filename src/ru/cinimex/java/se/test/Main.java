package ru.cinimex.java.se.test;

import ru.cinimex.java.se.test.entity.OperationType;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] newArray = new int[10][10];
        System.out.println("Hello world");

        // lesson 3.
        //  OperationType oType = new OperationType(1L, "Plus", 10);
        //  OperationType oType2 = new OperationType(2L, "Minus", 20);
        // oType.addOrderIndex(9, true);
        // oType.addOrderIndex(19, false);

        // lesson 2.
        // oType.printInfo();
        // oType2.printInfo();

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
