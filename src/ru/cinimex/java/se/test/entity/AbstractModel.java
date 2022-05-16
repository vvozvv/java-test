package ru.cinimex.java.se.test.entity;

public abstract class AbstractModel {
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInfoForPrint() {
        return "operationStageName";
    }
    public abstract void printInfo();
}
