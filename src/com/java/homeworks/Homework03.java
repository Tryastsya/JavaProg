package com.java.homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        System.out.println("Enter any number to check if it can be divided by 5 without decimals: ");

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        if(num1==0){
            System.out.println("0 can't be divided!");
        }else{
            if(num1%5==0) {
            System.out.println(num1 + " can be divided by 5 without decimals");
                }else {
                System.out.println(num1 + " can't be divided by 5 without decimals");
            }
        }
    }
}