package com.company;


public class Main {


    public static void main(String[] args) {
        BuildingManagementSystem system = new BuildingManagementSystem();

        Building building1 = new Building("Building 1", "1");
        building1.addSensor(new Sensor("CO2 Sensor 1","S1",0));

        Building building2 = new Building("Building 2", "2");
        building2.addSensor(new Sensor("CO2 Sensor 01","S1",0));

        system.AddBuilding(building1);
        system.AddBuilding(building2);
    }
}
