package ru.cinimex.java.se.test.entity;

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
        return this.operationStageName + " " + this.operStageCode;
    }

    @Override
    public void printInfo() {
        System.out.println(getInfoForPrint());
    }
}
