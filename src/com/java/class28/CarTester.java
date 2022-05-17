package com.java.class28;

public class CarTester {
    public static void main(String[] args) {
        Car c1 = new Car(2022, "Bugatti", "Chiron", 8.0, 1500, 2, "Red");
        Car c2 = new Car(1968, "Ford", "Mustang", 6.7, 50000, 2, "Silver");
        c2.carConfig();
        c1.carConfig();
    }
}
