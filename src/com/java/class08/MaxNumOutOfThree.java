package com.java.class08;

import java.util.Scanner;

public class MaxNumOutOfThree {
    public static void main(String[] args) {
        System.out.println("Please enter three numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a==b && b==c){
            System.out.println("All numbers are equal");
        }else {

            if (a > b) {
                if (a > c) {
                    System.out.println(a + " is the biggest number");
                } else {
                    System.out.println(c + " is the biggest number");
                }
            } else {
                if (b > c) {
                    System.out.println(b + " is the biggest number");
                } else {
                    System.out.println(c + " is the biggest number");
                }
            }
        }

    }
}
