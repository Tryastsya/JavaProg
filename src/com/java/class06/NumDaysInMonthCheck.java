package com.java.class06;

import java.util.Scanner;

public class NumDaysInMonthCheck {
    public static void main(String[] args) {
        System.out.println("Enter any number of month:");
        Scanner sc = new Scanner(System.in);
        int monthNum = sc.nextInt();

        if (monthNum == 1) {
            System.out.println("January has 31 days");
        } else if (monthNum == 2) {
            System.out.println("February has 28 or 29 days");
        } else if (monthNum == 3) {
            System.out.println("March has 31 days");
        } else if (monthNum == 4) {
            System.out.println("April has 30 days");
        } else if (monthNum == 5) {
            System.out.println("May has 31 days");
        } else if (monthNum == 6) {
            System.out.println("June has 30 days");
        } else if (monthNum == 7) {
            System.out.println("July has 31 days");
        } else if (monthNum == 8) {
            System.out.println("August has 31 days");
        } else if (monthNum == 9) {
            System.out.println("September has 30 days");
        } else if (monthNum == 10) {
            System.out.println("October has 31 days");
        } else if (monthNum == 11) {
            System.out.println("November has 30 days");
        } else if (monthNum == 12) {
            System.out.println("December has 31 days");
        } else {
            System.out.println("Please enter number of month from 1 to 12 only!");

        }
    }
}
