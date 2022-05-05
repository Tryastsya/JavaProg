package com.java.class24;

public class CountNumberOfEvenOddFromArray {
    public static void main(String[] args) {
        int data[] = {34, 6, 7, 23, 8, 0, 90, 35, 76};
        int odd = 0, even = 0;
        for(int i = 0;i<data.length; i++){
            if(data[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("In this array "+even+" even and "+odd+" odd numbers.");
    }
}
