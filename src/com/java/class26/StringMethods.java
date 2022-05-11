package com.java.class26;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        // Trim
        String str1 = "     Hello! Welcome to Ebay    ";
        String str2 = "Hello! Welcome to Ebay";
        System.out.println(str1.trim().equals(str2));

        // Format
        String str3 = "Welcome to %s classes, %s will guide you";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your fav programming:");
        String pl = sc.nextLine();
        System.out.println("Enter your fav mentor:");
        String mentor = sc.nextLine();
        System.out.println(String.format(str3, pl, mentor));

        // Split
        String str4 = "This is my statement to split";
        String[] words = str4.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        // Empty/Blank
        String str5 = "    ";
        System.out.println(str5.isEmpty());
        System.out.println(str5.isBlank());

        // SubString
        String str6 = "This is Java classes";
        System.out.println(str6.substring(6));
        System.out.println(str6.substring(2,16));

        // Replace
        System.out.println(str6.replace("Java", "Python"));
        System.out.println(str6.replaceAll("Java", "Python"));
    }
}
