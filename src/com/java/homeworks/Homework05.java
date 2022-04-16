package com.java.homeworks;


import java.util.Scanner;

/*
   Write a program to check given character is Vowel or Not
   Vowel characters are - 'a','e','i','o','u'
   (If you're not using scanner class it's fine you can directly take char value in program)
 */
public class Homework05 {
    public static void main(String[] args) {
        System.out.println("Please enter a character to check it's vowel or not:");
        Scanner sc = new Scanner(System.in);
        char char1 = sc.next().charAt(0);
        char1 = Character.toLowerCase(char1);

        switch (char1){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It's a vowel character");
                break;
            default:
                System.out.println("It's not a vowel character");
        }
        
    }
}
