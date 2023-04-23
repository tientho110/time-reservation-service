package com.nguyentientho.model;

public enum AmenityType {
    GYM("GYM"),
    POOL("POOL"),
    SAUNA("SAUNA"),
    YOGA("YOGA"),
    BOXING("BOXING"),
    PILATES("PILATES"),
    LESMILLS("LESMILLS"),
    AROBIC("AROBIC"),
    HIIT("HIIT"),
    CALISTHENICS("CALISTHENICS"),
    ;

    private final String name;

    private AmenityType(String value) {
        name = value;
    }

    @Override
    public String toString() {
        return name;
    }
}
