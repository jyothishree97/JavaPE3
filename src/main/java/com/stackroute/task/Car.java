package com.stackroute.task;

public class Car extends Vehicle {
    private int price;

    public Car(){

    }

    public Car(String name,String engine,int price){
        this.price=price;
    }


    //Direction Of The Car
    public void handSteering(String direction){
        if(direction.equalsIgnoreCase("Left")) {
            System.out.println("Car turns right");
        }
        else if(direction.equalsIgnoreCase("Right")){
            System.out.println("Car turns left");
        }
        else{
            System.out.println("Car doesn't change direction");
        }
    }

    //Car is in Which direction
    public void changeGears(int m){
        if(m==1)
            System.out.println("Car is in 1st gear");
        else if(m==2)
            System.out.println("Car is in 2nd gear");
        else if(m==3)
            System.out.println("Car is in 3rd gear");
        else
            System.out.println("Car is in neutral");
    }

    public void accelerate(int intialSpeed){
        intialSpeed+=10;
        System.out.println(intialSpeed);
    }
    public void deaccelerate(int finalSpeed){
        finalSpeed-=10;
        System.out.println(finalSpeed);

    }
}