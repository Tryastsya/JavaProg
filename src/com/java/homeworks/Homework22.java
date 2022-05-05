/*
============= Homework ==============
Write a program to find sum Of Array Elements (Example input - 5, 2, 3, 6, 1    Output - 17)
Write a program to Calculate the Average of Array Elements (Example input - 5, 6, 4, 3, 2    Output - 4.0)
Write a program of Find maximum number from an array (Example input - 5, 6, 4, 3, 2    Output - 6)
 *******USING ENHANCED FOR LOOP******* */
package com.java.homeworks;

public class Homework22 {
    public static void main(String[] args) {
        int data[] = {35, 33, 75, 43, 23, 67, 55};

        System.out.println("Sum of array is: "+sumArray(data));
        System.out.println("Average num in array is: "+avgArray(data));
        System.out.println("Maximum number in array is: "+maxArray(data));
    }

    static int sumArray(int data[]){
        int sum = 0;
        for (int num:data){
            sum = sum+num;
        }
        return sum;
    }

    static double avgArray(int data[]){
        double sum = 0;
        for(int num:data){
            sum = sum+num;
        }
        return sum/data.length;
    }

    static int maxArray (int data[]){
        int max = 0;
        for(int num:data){
            if(num>max){
                max = num;
            }
        }
        return max;
    }
}
