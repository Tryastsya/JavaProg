package com.java.class07;

import java.util.Scanner;

public class PrintNumberOfDayInMonthUsingSwitch {
    public static void main(String[] args) {
            System.out.println("Please enter a month:");
            Scanner sc4 = new Scanner(System.in);
            String month = sc4.nextLine().toLowerCase();

            switch (month) {
                case "january":
                    System.out.println("January has 31 days");
                    break;
                case "february":
                    System.out.println("February has 28 or 29 days");
                    break;
                case "march":
                    System.out.println("March has 31 days");
                    break;
                case "april":
                    System.out.println("April has 30 days");
                    break;
                case "may":
                    System.out.println("May has 31 days");
                    break;
                case "june":
                    System.out.println("June has 30 days");
                    break;
                case "july":
                    System.out.println("July has 31 days");
                    break;
                case "august":
                    System.out.println("August has 31 days");
                    break;
                case "september":
                    System.out.println("September has 30 days");
                    break;
                case "october":
                    System.out.println("October has 31 days");
                    break;
                case "november":
                    System.out.println("January has 30 days");
                    break;
                case "december":
                    System.out.println("December has 31 days");
                    break;
                default:
                    System.out.println("Please enter correct month name, first letter has to be capital");
            }
        }
}
