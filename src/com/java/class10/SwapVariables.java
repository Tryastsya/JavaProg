package com.java.class10;

import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int c = a;
        a = b;
        b = c;

        //without 3rd var
        a = a + b; // a = a * b;
        b = a - b; // b = a / b;
        a = a - b; // a = a / b;


        System.out.println(a);
        System.out.println(b);
    }
}
