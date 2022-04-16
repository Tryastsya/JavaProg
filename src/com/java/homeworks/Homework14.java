package com.java.homeworks;
/*
Write a program to print table of given number. If user enters 3 then print table of 3 like below
/// 3 6 9 12 15 18 21 24 27 30
 */
import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Please enter a number:");
        int num = sc.nextInt();
        while(i<=10) {
            System.out.println(i * num);
            i++;
        }
    }
}
