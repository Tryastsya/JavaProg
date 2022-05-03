package com.java.class23;

public class FindMaxFromArray {
    public static void main(String[] args) {
        int data[] = {35, 33, 75, 43, 23, 67};
        int maxNum = 0;
        for (int i = 0; i< data.length; i++){
            if(maxNum<data[i]){
                maxNum=data[i];
            }
        }
        System.out.println(maxNum);
    }
}
