package com.java.homeworks;

import java.util.Scanner;

//Write a program to take number from user and check if it's divisible by 5 or 3
public class Homework09 {
    public static void main(String[] args) {
        System.out.println("Please enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(((num % 5) == 0) || ((num % 3) == 0)) {
            System.out.println("This number is divisible by 5 or 3");
        }else{
            System.out.println("This number is not divisible by 5 or 3");
        }
    }
}
