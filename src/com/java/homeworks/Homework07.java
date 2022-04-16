package com.java.homeworks;

import java.util.Scanner;

/*
        Write a java program to get marks from users and print grades based on marks (feel free to use any statements)
        If marks are from 90 to 100 Print A
        If marks are from 80 to 89 Print B
        If marks are from 70 to 79 Print C
        If marks are from 60 to 69 Print D
        If marks are from 50 to 59 Print E
        If marks are from 0 to 49 Print Fail
*/
public class Homework07 {
    public static void main(String[] args) {
        System.out.println("Please enter your mark:");
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();

        if(mark>100) {
            System.out.println("Maximum mark is 100! Please enter correct mark");
        }else if(mark>90) {
            System.out.println("Your grade is A");
        }else if(mark>80) {
            System.out.println("Your grade is B");
        }else if(mark>70) {
            System.out.println("Your grade is C");
        }else if(mark>60) {
            System.out.println("Your grade is D");
        }else if(mark>50) {
            System.out.println("Your grade is E");
        }else if(mark>=0) {
            System.out.println("You failed");
        }else {
            System.out.println("You can't have negative mark");
        }
    }
}
