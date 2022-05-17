package ru.cinimex.java.se.test.service;

import ru.cinimex.java.se.test.entity.OperationType;

public interface SerializeService  {
    void serializeOperationType(OperationType operationType);
    OperationType deserializeOperationType();
}
