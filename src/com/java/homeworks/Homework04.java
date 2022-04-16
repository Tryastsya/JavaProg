package com.java.homeworks;

import java.util.Scanner;

/*
   Write a java program to Find Company name from the given product
   Possible inputs = {gmail, whatsapp, youtube, Skype, Hangouts, outlook}
   Possible Outputs = {google, facebook, microsoft}
*/
public class Homework04 {
    public static void main(String[] args) {
        System.out.println("Please enter product name to check it's owner:");
        Scanner sc = new Scanner(System.in);
        String productName = sc.nextLine().toLowerCase();

        switch (productName){
            case "gmail":
            case "youtube":
            case "hangouts":
                System.out.println("This product belongs to Google");
                break;
            case "whatsapp":
                System.out.println("This product belongs to Facebook");
                break;
            case "skype":
            case "outlook":
                System.out.println("This product belongs to Microsoft");
                break;
            default:
                System.out.println("Please enter one of the given products");
        }
    }
}
