package com.java.class15;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter any word:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String rev = "";

        for(int i=(str.length()-1); i>=0; i--) {
            rev = rev+str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("This word is palindrome");
        }else {
            System.out.println("This word isn't palindrome");
        }
    }
}
