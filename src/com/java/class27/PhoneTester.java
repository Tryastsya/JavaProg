package com.java.class27;

public class PhoneTester {
    public static void main(String[] args) {
        Phone p;

        p = new Phone();

        

        System.out.println(p.memory);
        System.out.println(p.os);
        System.out.println(p.color);
        System.out.println(p.isTouchScreen);
        System.out.println(p.typeOfChargingPort);
        System.out.println(p.model);
        System.out.println(p.camera);

        p.call("12345");
        p.takePictures();
        String name = p.takePictures();
        System.out.println(name);

        p.connectToInternet("ComCast", "qwerty");


    }
}
