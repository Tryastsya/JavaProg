package com.java.class12;

public class SumOf1to10 {
    public static void main(String[] args) {
        int j = 0;
        for(int i=1; i<=10; i++){
            j = i+j;
        }
        System.out.println(j);
    }
}
