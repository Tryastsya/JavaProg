package com.java.class16;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int num = sc.nextInt();
        String result = "";
        if(num<2) {
            result = "Not Prime";
        }else if(num==2||num==3) {
            result = "Prime";
        }else{
            for(int i = 2; i<=num/2; i++){
                if((num%i)!=0) {
                    result = "Prime";
                }else{
                    result = "Not Prime"; break;
                }
            }
        }
        System.out.println(result);
    }
}
