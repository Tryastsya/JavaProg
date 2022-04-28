package com.java.class17;

import java.util.Scanner;

public class MethodExample {

            static void printLine(int length, char c){
                for(int i = 1; i<=length; i++){
                    System.out.print(c);
                }
                System.out.println();
            }

    public static void main(String[] args) {
        printLine(20, '=');
        System.out.println("Please enter the first number: ");
        printLine(25, '*');
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(15);
        printLine(50, '-');
        System.out.println("Please enter the second number: ");
        printLine(15, '8');
        int b = sc.nextInt();
        printLine(30, ',');
        System.out.println("Please enter the operation (add/sub/div/mul): ");
        printLine(25, '$');
        String oper = sc.next().toLowerCase();

        switch (oper){
            case "add":
                System.out.println(a+b);
                break;
            case "sub":
                System.out.println(a-b);
                break;
            case "div":
                System.out.println(a/b);
                break;
            case "mul":
                System.out.println(a*b);
                break;
            default:
                System.out.println("Invalid choice... please try again");
        }
    }
}
