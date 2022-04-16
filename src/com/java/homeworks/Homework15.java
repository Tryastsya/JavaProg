package com.java.homeworks;
/*
Write a program to print numbers that are divisible by 3 and 5 from 1 to 50
 */
public class Homework15 {
    public static void main(String[] args) {
        int i = 1;
        while (i<=50){
            if (i%3==0 && i%5==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
