package com.java.class06;

import java.util.Scanner;

public class LadderIfElseExample {
    public static void main(String[] args) {

        //Input
        System.out.println("Enter any number from 0 to 6");
        Scanner sc = new Scanner(System.in);
        int dayNum = sc.nextInt();

        //Output

        if(dayNum==0) {
            System.out.println("Sunday");
        }else if(dayNum==1) {
            System.out.println("Monday");
        }else if(dayNum==2) {
            System.out.println("Tuesday");
        }else if(dayNum==3) {
            System.out.println("Wednesday");
        }else if(dayNum==4) {
            System.out.println("Thursday");
        }else if(dayNum==5) {
            System.out.println("Friday");
        }else if(dayNum==6) {
            System.out.println("Saturday");
        }else {
            System.out.println("Please enter from 0 to 6 only!");

        }


    }
}
