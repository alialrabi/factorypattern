package com.example.factorypattern.enums;

public enum ContentEnum {

    DOC(1),PDF(2),XLS(3),EXCEL(4), OTHER(5);

    private final int value;

    public int getValue(int value){
        return value;
    }

    ContentEnum(int value) {
        this.value=value;
    }
}
