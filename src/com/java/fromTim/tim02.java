package com.java.fromTim;

public class tim02 {

    public static void main(String[] args) {

        int num1 = 3;

//    || -> OR -> 1st 2nd one of them must be true
//    && -> AND -> 1st AND 2nd both of them must be true

        if (num1 > 2 && num1 < 0) {
            System.out.println("OR operator");
        } else if (num1 > 2 || num1 < 0) {
            System.out.println("AND operator");
        } else if (num1 > 2 && (num1 < 0 || num1 == 3)) {
            System.out.println("random");
        }
    }
}