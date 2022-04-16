package com.java.class06;

import java.util.Scanner;

public class PosNegNumCheck {
    public static void main(String[] args) {

        System.out.println("Enter any number: ");

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        if(num1==0){
            System.out.println("It's a zero!");
        }else if(num1>0) {
            System.out.println(num1 + " is a positive");
        }else {
            System.out.println(num1 + " is a negative");
            }

    }
}
