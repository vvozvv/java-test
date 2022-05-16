package ru.cinimex.java.se.test.service;

import ru.cinimex.java.se.test.entity.AbstractModel;

public class PrintServiceImpl implements PrintService {
    @Override
    public void printModel(AbstractModel model) {
        System.out.println(model.getInfoForPrint());
    }
}
