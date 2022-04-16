package com.java.class11;

import java.util.Scanner;

public class BrainstormingWhileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many numbers we need to print");
        int i = sc.nextInt();
        int j = 1;
        while (j<=i){
            System.out.println(j*6);
            j++;
        }
    }
}
