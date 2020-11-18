package com.company;

import java.util.UUID;

public class Actuator extends Unit {

    private double value;

    public Actuator(String name, UUID ID, double value){
        super(name,ID);
        this.setValue(value);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
