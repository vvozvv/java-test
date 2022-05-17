package ru.cinimex.java.se.test.service;

import ru.cinimex.java.se.test.entity.AbstractModel;
import ru.cinimex.java.se.test.exception.NegativeIdentifierException;

public interface CreateService<T extends AbstractModel> {
    T createModel(Long id) throws NegativeIdentifierException;
}
