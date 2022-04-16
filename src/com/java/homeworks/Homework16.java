package com.java.homeworks;

import java.util.Scanner;

/*
Write a program to print numbers that are not divisible by 3 and divisible by 7
 */
public class Homework16 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int i = 1;
            System.out.println("Please enter a number:");
            int num = sc.nextInt();
            while(i<=num) {
                if (i % 3 != 0 && i % 7 == 0) {
                    System.out.println(i);
                }
                i++;
            }
    }
}
