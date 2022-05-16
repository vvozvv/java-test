package ru.cinimex.java.se.test.entity;

import java.util.Objects;

public class OperationStage extends AbstractModel {
    String operationStageName;
    OperationStageCode operStageCode;

    public OperationStage(String operationStageName, OperationStageCode operStageCode) {
        this.operationStageName = operationStageName;
        this.operStageCode = operStageCode;
    }

    public String getOperationStageName() {
        return operationStageName;
    }

    public void setOperationStageName(String operationStageName) {
        this.operationStageName = operationStageName;
    }

    public OperationStageCode getOperStageCode() {
        return operStageCode;
    }

    public void setOperStageCode(OperationStageCode operStageCode) {
        this.operStageCode = operStageCode;
    }

    public String getInfoForPrint() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.operationStageName).append(" ").append(this.operStageCode);
        return sb.toString();
    }

    @Override
    public void printInfo() {
        System.out.println(getInfoForPrint());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperationStage that = (OperationStage) o;
        return Objects.equals(operationStageName, that.operationStageName) && operStageCode == that.operStageCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationStageName, operStageCode);
    }
}
