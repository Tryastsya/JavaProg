package com.java.class20;

public class PatternProgram2 {
    public static void main(String[] args) {
        for(int i =1; i<=3; i++){
            for(int j =5; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =1; i<=3; i++){
            for(int j =i; j<=i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
