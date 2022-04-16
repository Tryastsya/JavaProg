package com.java.class05;

import java.util.Scanner;

public class ifElseEx2 {
    public static void main(String[] args) {
        System.out.println("Enter any number - ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("It's an even number");
        }
        else{
            System.out.println("It's an odd number");
        }

    }
}
