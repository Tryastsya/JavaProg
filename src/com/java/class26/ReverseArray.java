package com.java.class26;

public class ReverseArray {
    public static void main(String[] args) {
        int data[]= {30,40,10,50,32};

        for (int num:data){
            System.out.println(num);
        }
        int j = data.length-1;
        for (int i = 0; i<data.length/2; i++){
                   int temp = data[i];
                   data[i] = data[j];
                   data[j] = temp;
                   j--;
        }
        for (int num:data){
            System.out.println(num);
        }
    }
}
