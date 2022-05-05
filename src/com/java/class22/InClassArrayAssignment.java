package com.java.class22;

import java.util.Scanner;

public class InClassArrayAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numArray [];
        numArray = new int[5];
        System.out.println("Please enter "+numArray.length+" numbers");

        for (int i=0; i< numArray.length; i++){
            numArray[i] = sc.nextInt();
        }
        System.out.println("Numbers in array is:");
        for (int j=0; j< numArray.length; j++){
            System.out.println("data["+j+"]="+numArray[j]);
        }
    }
}
