package com.company;

import java.util.UUID;

public class Unit
{
    private String name;
    private String ID;

    public Unit(String name, UUID id)
    {
        this.name = name;
        this.ID = UUID.randomUUID().toString();;
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
