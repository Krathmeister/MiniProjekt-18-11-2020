package com.company;

import java.util.UUID;

public class Unit
{
    private String name;
    private UUID ID;

    public Unit(String name, UUID id)
    {
        this.name = name;
        this.ID = id;
    }

    protected String getName()
    {
        return name;
    }

    protected UUID getID()
    {
        return ID;
    }

}
