package com.java.class16;

import java.util.Scanner;

public class FindOccurenceOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your statement:");
        String str = sc.nextLine().toLowerCase();
        System.out.println("What letter your want to count?:");
        char c = sc.nextLine().toLowerCase().charAt(0);
        int countA = 0;
        str.toLowerCase();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c) countA++;
        }
        System.out.println(countA);
    }
}
