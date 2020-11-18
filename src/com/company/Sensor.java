package com.company;

public class Sensor extends Unit
{
    private double Value;

    public Sensor (String name, double Value)
    {
        super(name, ID);
    }

    public double getValue()
    {
        return Value;
    }
}
