package com.company;

import java.util.UUID;

public class Unit
{
    public String name;
    public String ID = UUID.randomUUID().toString();

    public Unit(String name)
    {
        this.name = name;
    }

    protected String getName()
    {
        return name;
    }

    protected String getID()
    {
        return ID;
    }

}
