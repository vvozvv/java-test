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

    public void addOrderIndex(int addIndex, boolean useIfBlockInsteadSwitch) {
        int remains = addIndex % 3;

        if (useIfBlockInsteadSwitch) {
            if (remains == 0) {
                System.out.println(this.orderIndex + addIndex);
            } else if (remains == 1) {
                System.out.println(this.orderIndex - addIndex);
            } else if (remains == 2) {
                System.out.println(this.orderIndex * addIndex);
            }
        } else {
            switch (remains) {
                case 0 -> System.out.println(this.orderIndex + addIndex);
                case 1 -> System.out.println(this.orderIndex - addIndex);
                case 2 -> System.out.println(this.orderIndex * addIndex);
                default -> System.out.println("Ничего не найденно");
            }
        }


    }
}
