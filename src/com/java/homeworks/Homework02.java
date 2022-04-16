package com.java.homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        System.out.println("Enter any year to check if it's leap: ");

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        if(num1%4==0) {
            System.out.println(num1 + " is a leap year");
        }else{
            System.out.println(num1 + " isn't a leap year");
        }
    }
}
