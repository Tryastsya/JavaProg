package com.java.class11;

public class WhilePractice {
    public static void main(String[] args) {
        int i=1;
        while(i<=10){
            System.out.println(11-i); //reversed output 10-1
            i++;
        }

        //Another way
        i = 1;
        int j = 10;
        while(i<=10){
            System.out.println(j);
            j--;
            i++;
        }
    }
}
