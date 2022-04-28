/*
============== Homework =======================
Write a program to find maximum digit from the given number (Example input - 4346345, Ouput - 6)
Write a program to Count Number of Digit (Example input - 4345, Ouput - 4)
Write a program to Reverse number (Example input - 4345, Ouput - 5434)
Write a program to Check Given number is Palindrome or not (Example input - 23532, Ouput - Yes)
 */

package com.java.homeworks;

import java.util.Scanner;

public class Homework20 {
    public static void main(String[] args) {

//MAXIMUM DIGIT

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to check maximum digit");
        int num = sc.nextInt();
        int d = 0;

        while(num!=0) {
            if (d<(num % 10)){
                d=(num % 10);
            }
            num = num / 10;
        }
        System.out.println("Max digit is "+d);
        printLine();

//DIGIT COUNT

        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to count number of digits");
        num = sc.nextInt();
        int count = 0;

        while(num!=0) {
            num = num / 10;
            count++;
        }
        System.out.println("It contains "+count+" digits");
        printLine();

//REVERSE

        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to get reversed");
        num = sc.nextInt();
        int rev = 0;

        while(num!=0) {
            rev = (num % 10) + rev*10;
            num = num / 10;
        }
        System.out.println(rev);
        printLine();

//PALINDROME CHECK

        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to check palindrome");
        int i = sc.nextInt();
        rev = 0;
        num = i;

        while(i!=0) {
            rev = (i % 10) + rev*10;
            i = i / 10;
        }
        if(num==rev){
            System.out.println(num+" is a palindrome number");
        }else{
            System.out.println(num+" is not a palindrome number");
        }



    }
    static void printLine (){
        System.out.println("------------------------------");
    }
}
