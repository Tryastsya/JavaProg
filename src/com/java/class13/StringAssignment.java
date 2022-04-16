package com.java.class13;

import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "DevX";
        String str2 = "DevX";
        System.out.println("Please enter str3");
        String str3 = sc.nextLine();

        System.out.println("Comparing str1 and str2");
        if (str1 == str2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println("Comparing str2 and str3");
        if (str2 == str3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println("Comparing str1 and str3");
        if (str1.equals(str3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
