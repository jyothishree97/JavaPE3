package com.stackroute.task;

public class Vehicle {
    private String name;
    private String engine;

    public Vehicle() {
    }

    public Vehicle(String name, String engine){
        this.engine=engine;
        this.name=name;
    }
    public void startVehicle(){
        System.out.println("Vehicle Started");
    }

}
