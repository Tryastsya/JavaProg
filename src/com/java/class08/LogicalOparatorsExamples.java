package com.java.class08;

public class LogicalOparatorsExamples {
    public static void main(String[] args) {
        boolean b1 = true, b2 = false,b3 = true;

        System.out.println(b1 && b2); //false
        System.out.println(b1 || b2); //true
        System.out.println(!b1 || !b2); //true
        System.out.println(b1 || b2 && b3); //true  && has higher priority that ||
        System.out.println(b1 && b2 || b2 && b3 || b1 && !b3); //false


    }
}
