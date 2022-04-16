package com.java.class11;

import java.util.Scanner;

// 1 2 * 4 5 * 7 8 * 10
public class InClassExample1 {
    public static void main(String[] args) {
        System.out.println("Enter number of numbers:");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int i = 1;
        while (i<=limit){
            System.out.println(i);
            i++;
            if(i%3==0){
                System.out.println("*");
                i++;
            }
        }
    }
}
