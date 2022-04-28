package com.java.class16;

import java.util.Scanner;

public class StringPracticeWordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your statement:");
        String str = sc.nextLine();

        String num [] = str.split(" ");
        System.out.println(num.length);
    }
}
