package com.java.class21;

import java.util.Scanner;

public class ReverseOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        int rev = 0;

        while(num!=0) {
            rev = (num % 10) + rev*10;
            num = num / 10;

        }
        System.out.println(rev);
    }
}
