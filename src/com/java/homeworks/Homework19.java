package com.java.class19;

public class Homework19 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}