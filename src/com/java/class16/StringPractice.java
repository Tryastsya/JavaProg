package com.java.class16;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rev = "";
        System.out.println("Please enter the word:");
        String str = sc.nextLine();

        for(int i = str.length()-1; i>=0; i--){
            rev = rev+str.charAt(i);
        }
        System.out.println(rev);

    }
}
