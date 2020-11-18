package com.company;

import java.util.UUID;

public class Sensor extends Unit
{
    private double value;

    public Sensor (String name, UUID ID, double value)
    {
        super(name, ID);
        this.value = value;
    }

    public double getValue()
    {
        return value;
    }
}
