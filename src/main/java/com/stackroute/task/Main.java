package com.stackroute.task;

public class Main {
    public static void main(String[] args){
        //creating the objects
        Car car= new Car("Benz" , "Engine",1500000);
        CarModel carModel=new CarModel();

        car.startVehicle();
        car.handSteering("left");
        car.changeGears(1);
        carModel.handSteering("right");
        car.accelerate(25);
        carModel.deaccelerate(25);
        carModel.startVehicle();

    }
}

