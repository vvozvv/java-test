package ru.cinimex.java.se.test.service;

import ru.cinimex.java.se.test.entity.OperationStage;
import ru.cinimex.java.se.test.entity.OperationStageCode;
import ru.cinimex.java.se.test.exception.NegativeIdentifierException;

public class StageCreateServiceImpl implements CreateService {
    @Override
    public OperationStage createModel(Long id) throws NegativeIdentifierException {
        if(id < 3) {
            throw new NegativeIdentifierException("id не может быть меньше 0");
        }
        return new OperationStage("id", OperationStageCode.NEW);
    }
}
