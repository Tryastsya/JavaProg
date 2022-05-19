package com.java.class30;

class Car {
    static int staticCount;
    int instCount;

    Car() {
        staticCount++;
        instCount = staticCount;
    }

    void printCount() {
        System.out.println(instCount);
    }
}
public class StaticVariablesExample {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        Car c4 = new Car();
        Car c5 = new Car();

        c2.printCount();
        c5.printCount();
    }
}
