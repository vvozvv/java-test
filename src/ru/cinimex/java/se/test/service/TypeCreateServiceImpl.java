package ru.cinimex.java.se.test.service;

import ru.cinimex.java.se.test.entity.OperationType;
import ru.cinimex.java.se.test.exception.NegativeIdentifierException;

public class TypeCreateServiceImpl implements CreateService {

    @Override
    public OperationType createModel(Long id) throws NegativeIdentifierException {
        if(id < 3) {
            throw new NegativeIdentifierException("id не может быть меньше 0");
        }
        return new OperationType(id, "1hjhk", 1);
    }
}
