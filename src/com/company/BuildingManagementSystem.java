package com.company;

import java.util.ArrayList;
import java.util.UUID;

public class BuildingManagementSystem
{
    private ArrayList<Building> Buildings = new ArrayList<Building>();

    public BuildingManagementSystem (ArrayList Buildings)
    {
        this.Buildings = Buildings;
    }

    protected void AddBuilding(Building b)
    {
        Buildings.add(b);
    }

    protected void RemoveBuilding(Building b, UUID id)
    {
        if( b.getID() == id )
        Buildings.remove(b);
    }

    protected void DeleteBuildings()
    {
        Buildings.clear();
    }
}
