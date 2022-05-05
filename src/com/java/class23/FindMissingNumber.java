package com.java.class23;

public class FindMissingNumber {
    public static void main(String[] args) {
        int data[] = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        int sum = 0;

        int dataExp[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumExp = 0;

        for(int num:data){
            sum = sum+num;
        }
        for(int num:dataExp){
            sumExp = sumExp+num;
        }
        System.out.println("Missing number is: "+(sumExp-sum));
    }
}
