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

    public OperationType(Long id) {
        this.id = id;
        this.operationTypeName = null;
        this.orderIndex = null;
    }

    private String getInfoForPrint() {
        return orderIndex + ":" + operationTypeName;
    }

    public void printInfo() {
        System.out.println(getInfoForPrint());
    }

    public void addOrderIndex(int addIndex, boolean useIfBlockInsteadSwitch) {
        int remains = addIndex % 3;

        if (this.orderIndex == null) {
            System.out.println("orderIndex not found");
            return;
        }

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
