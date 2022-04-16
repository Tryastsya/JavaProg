package com.java.homeworks;

import java.util.Scanner;

/*
Write a program to get T-shirt size in inches and print size based on inches
        If inches is 27 to 30 Print XS
        If inches is 31 to 34 Print S
        If inches is 35 to 38 Print L
        If inches is 39 to 42 Print XL
        If inches is 45 to 50 Print XXL
 */
public class Homework08 {
    public static void main(String[] args) {
        System.out.println("Please enter your T-shirt size in inches:");
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        if(in<27) {
            System.out.println("Sorry, we haven't your size");
        }else if(in<31){
            System.out.println("Your size is XS");
        }else if(in<35){
            System.out.println("Your size is S");
        }else if(in<39){
            System.out.println("Your size is L");
        }else if(in<43){
            System.out.println("Your size is XL");
        }else if(in<51){
            System.out.println("Your size is XXL");
        }else{
            System.out.println("Sorry, we haven't your size");

        }

    }
}
