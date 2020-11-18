package com.company;

import java.util.ArrayList;
import java.util.UUID;

public class BuildingManagementSystem
{
    private ArrayList<Building> Buildings = new ArrayList<Building>();

    public BuildingManagementSystem()
    {
    }


    protected void AddBuilding(Building b)
    {
        Buildings.add(b);
        System.out.println(b + " Was added.");
    }

    protected void RemoveBuilding(Building b, UUID id)
    {
        if( b.getID().equals(id) )
        Buildings.remove(b);
    }

    protected void DeleteBuildings()
    {
        Buildings.clear();
    }


}
