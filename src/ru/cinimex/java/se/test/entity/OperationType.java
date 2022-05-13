package ru.cinimex.java.se.test.entity;

public class OperationType {
    public Long id;
    public String operationTypeName;
    public Integer orderIndex;

    public OperationType(Long id, String operationTypeName, Integer orderIndex) {
        this.id = id;
        this.operationTypeName = operationTypeName;
        this.orderIndex = orderIndex;
    }

    public void printInfo() {
        System.out.println("id = " + this.id + ", operationTypeName = " + this.operationTypeName + ", orderIndex = " + this.orderIndex);
    }
}
