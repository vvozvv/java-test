package ru.cinimex.java.se.test.entity;

import java.util.Objects;

public class OperationType extends AbstractModel {
    public Long id;
    public String operationTypeName;
    public Integer orderIndex;
    public OperationTypeCode operTypeCode;
    public static String OPER_TYPE_STR = "Тип операции";
    public static String ORDER_INDEX_STR = "Порядок сортировки";

    public Long getId() {
        return id;
    }

    public String getOperationTypeName() {
        return operationTypeName;
    }

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public OperationTypeCode getOperTypeCode() {
        return operTypeCode;
    }

    public OperationType(Long id, String operationTypeName, Integer orderIndex) {
        this.id = id;
        this.operationTypeName = operationTypeName;
        this.orderIndex = orderIndex;
    }

    public OperationType(Long id) {
        this.id = id;
        this.operationTypeName = null;
        this.orderIndex = null;
        this.operTypeCode = null;
    }

    public OperationType(Long id, String operationTypeName, Integer orderIndex, OperationTypeCode operTypeCode) {
        this.id = id;
        this.operationTypeName = operationTypeName;
        this.orderIndex = orderIndex;
        this.operTypeCode = operTypeCode;
    }

    public String getInfoForPrint() {
        StringBuilder message = new StringBuilder();
        message.append(this.id).append('.').append(OPER_TYPE_STR).append(":").append(operationTypeName).append(", ").append(ORDER_INDEX_STR).append(":").append(orderIndex).append(", ").append(this.operTypeCode);
        return message.toString();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperationType that = (OperationType) o;
        return Objects.equals(id, that.id) && Objects.equals(operationTypeName, that.operationTypeName) && Objects.equals(orderIndex, that.orderIndex) && operTypeCode == that.operTypeCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, operationTypeName, orderIndex, operTypeCode);
    }
}
