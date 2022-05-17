package com.java.class28;

public class Car {
    String color;
    double engine;
    int doors;
    int year;
    String make;
    String model;
    int milage;

    Car(int yearFromUser, String makeFromUser, String modelFromUser, double engineFromUser, int mileageFromUser, int doorsFromUser, String colorFromUser){
        make = makeFromUser;
        year = yearFromUser;
        milage = mileageFromUser;
        model = modelFromUser;
        engine = engineFromUser;
        doors = doorsFromUser;
        color = colorFromUser;

    }

    public void carConfig(){
        System.out.println(make+" "+model);
        System.out.println(year);
        System.out.println(engine+"-liter engine");
        System.out.println(milage+" mi");
        System.out.println(color);
        System.out.println(doors+" doors");
    }
}

