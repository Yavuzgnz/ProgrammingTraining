package com.jarvis.day02;

public class Car {

    String model;
    int build;

    public Car(String model, int build) {
        this.model = model;
        this.build = build;
    }

    public void showCar() {
        System.out.println("The car model is " + model + " and build is " + build + ".");
    }


}
