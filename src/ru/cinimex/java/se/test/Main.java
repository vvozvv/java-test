package ru.cinimex.java.se.test;

import ru.cinimex.java.se.test.entity.OperationStage;
import ru.cinimex.java.se.test.entity.OperationStageCode;
import ru.cinimex.java.se.test.entity.OperationType;
import ru.cinimex.java.se.test.entity.OperationTypeCode;
import ru.cinimex.java.se.test.exception.NegativeIdentifierException;
import ru.cinimex.java.se.test.service.PrintServiceImpl;
import ru.cinimex.java.se.test.service.SerializeServiceImpl;
import ru.cinimex.java.se.test.service.StageCreateServiceImpl;
import ru.cinimex.java.se.test.service.TypeCreateServiceImpl;

import java.io.IOException;

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
//        for (int i = 0; i < newArray.length; i++) {
//            for (int j = 0; j < newArray[i].length; j++) {
//                newArray[i][j] = (int) (1 + Math.random() * 100);
//            }
//        }
//
//        for (int[] anArr : newArray) {
//            Arrays.sort(anArr);
//            for (int anAnArr : anArr) {
//                System.out.print(anAnArr + " ");
//            }
//            System.out.println();
//        }

        // lesson 7 && 8
        PrintServiceImpl ob = new PrintServiceImpl();
        OperationStage prints = new OperationStage("pechat", OperationStageCode.DONE);
        OperationStage prints2 = new OperationStage("pechat", OperationStageCode.DONE);
        ob.printModel(prints);
        ob.printModel(oType2);
        System.out.println(prints.hashCode() == prints2.hashCode());

        // lesson 9
        try {
            TypeCreateServiceImpl typeService = new TypeCreateServiceImpl();
            StageCreateServiceImpl typeService2 = new StageCreateServiceImpl();
            typeService.createModel(3L);
            typeService2.createModel(4L);
        } catch (NegativeIdentifierException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Объекты успешно создались");
        }

        // lesson 10
        try {
            SerializeServiceImpl ss = new SerializeServiceImpl("C:\\Users\\avazhov\\Desktop\\project\\data.data");
            SerializeServiceImpl ss2 = new SerializeServiceImpl("");
            ss.serializeOperationType(oType);
            ss2.serializeOperationType(oType2);
            ss2.deserializeOperationType();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
