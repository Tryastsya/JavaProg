package com.java.class07;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner sc3 = new Scanner(System.in);
        int num = sc3.nextInt();

        switch (num){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Please enter from 0-5");
                // without break it gonna print all statements after first match true
                // last break isn't mandatory
                // default is the same as case but indicates rest of statements
                // default can be anywhere in switch but usually at the end
        }

    }
}
