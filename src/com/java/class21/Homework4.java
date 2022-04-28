package com.java.class21;

public class Homework4 {
    public static void main(String[] args) {
        int k = 1;
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(k);
            }
            k=k+2;
            System.out.println();
        }

        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(2*i-1);
            }
            System.out.println();
        }

        for(int i = 1; i<=9; i=i+2){
            for(int j = 1; j<=(i+1)/2; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
