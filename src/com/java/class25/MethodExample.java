package com.java.class25;

import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {

        int num = getNumberFromUser();
        System.out.println(num);

        int num1 = 10;
        method1(num1); //losing value, returning to nowhere
        System.out.println(num1);
        int result = method1(num1); //assigning value to variable
        System.out.println(result);
        System.out.println(method1(num1)); //printing value of calculation in method

        System.out.println("Method 1");
        int sum = getNumberFromUser()+method1(getNumberFromUser());
        System.out.println(sum);

        System.out.println("Method 2");
        int res = method2(10, 20);
        System.out.println(res);

    }

    static int method2(int num1, int num2){
        return getNumberFromUser() + getNumberFromUser();
    }

    static int method1 (int num1){
        return num1 * 10;
    }

    static int getNumberFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = sc.nextInt();
        return num;
    }
}
