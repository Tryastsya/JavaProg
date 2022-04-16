package com.java.class07;

import java.util.Scanner;

public class PrintNumberInTextAssingment {
    public static void main(String[] args) {
        System.out.println("Enter the number from 0 to 9:");
        Scanner sc2 = new Scanner(System.in);
        int numText = sc2.nextInt();

        if (numText == 0) {
            System.out.println("Zero");
        }else if(numText == 1){
            System.out.println("One");
        }else if(numText == 2){
            System.out.println("Two");
        }else if(numText == 3){
            System.out.println("Three");
        }else if(numText == 4){
            System.out.println("Four");
        }else if(numText == 5){
            System.out.println("Five");
        }else if(numText == 6){
            System.out.println("Six");
        }else if(numText == 7){
            System.out.println("Seven");
        }else if(numText == 8){
            System.out.println("Eight");
        }else if(numText == 9){
            System.out.println("Nine");
        }else {
            System.out.println("Print correct number");
        }
    }
}
