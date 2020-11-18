package com.company;

import java.util.ArrayList;

public class Building extends Unit {
    private ArrayList<Sensor> sensors = new ArrayList<Sensor>();
    private ArrayList<Actuator> actuators = new ArrayList<>();

    public Building(String name, String ID) {
        super(name, ID);
    }

    public int getSensors() {
        return sensors.size();
    }

    public int getActuators() {
        return actuators.size();
    }

    public void addSensor(Sensor sensor){
        sensors.add(sensor);
    }
    public void addActuator(Actuator actuator){
        actuators.add(actuator);
    }

    @Override
    public String toString() {
        return getName();
    }

}
