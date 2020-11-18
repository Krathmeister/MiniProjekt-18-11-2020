package com.company;

import java.util.ArrayList;
import java.util.UUID;

public class Building extends Unit {
    private ArrayList<Sensor> sensors = new ArrayList<Sensor>();
    private ArrayList<Actuator> actuators = new ArrayList<>();

    public Building(String name, String ID) {
        super(name, ID);
    }

    public ArrayList<Sensor> getSensors() {
        return sensors;
    }

    public ArrayList<Actuator> getActuators() {
        return actuators;
    }

    @Override
    public String toString() {
        return getName();
    }
}
