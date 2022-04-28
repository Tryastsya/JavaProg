package com.java.class20;

public class PatternProgram1 {

    static void printLine(){
        System.out.println("===============");
    }

    public static void main(String[] args) {
        int count = 0;
        for(int i=5; i>=1; i--){
            for(int j=5; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        printLine();

        for(int i=1; i<=5; i++){
            for(int j=9; j>=i+4; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        printLine();

        for(int i=5; i>=1; i--){
            int k = 9;
            for(int j=1; j<=i; j++){
                System.out.print(k);
                k--;
            }
            System.out.println();
        }
        printLine();

        for(int i=5; i>=1; i--){
            int k = 9;
            for(int j=1; j<=i; j++){
                System.out.print(k);
                k--;
            }
            System.out.println();
        }
        printLine();
    }
}
