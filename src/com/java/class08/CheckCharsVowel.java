package com.java.class08;

import java.util.Scanner;

public class CheckCharsVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a character to check it's vowel or not:");
        char ch1 = sc.next().charAt(0);
        ch1 = Character.toLowerCase(ch1);

        if (ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u') {
            System.out.println("It's a vowel character");
        }else {
            System.out.println("It's not a vowel character");
        }
    }
}
