package com.company;

import java.util.ArrayList;
import java.util.UUID;

public class BuildingManagementSystem {
    private ArrayList<Building> Buildings = new ArrayList<Building>();

    protected void AddBuilding(Building b) {
        Buildings.add(b);
        System.out.println(b.getName() + " was added with amount of sensors: " + b.getSensors());
    }

    protected void RemoveBuilding(Building b, String id) {
        if (b.getID().equals(id))
            Buildings.remove(b);
    }

    protected void DeleteBuildings() {
        Buildings.clear();
    }


}
