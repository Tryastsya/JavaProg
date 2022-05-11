package com.java.class26;

public class FindMinFromArray {
    public static void main(String[] args) {
        int data[] = {35, 33, 75, 43, 23, 67};
        int minNum = data[0];
        for (int i = 1; i< data.length; i++){
            if(minNum>data[i]){
                minNum=data[i];
            }
        }
        System.out.println(minNum);

        for (int i : data) {
            if (minNum > i) {
                minNum = i;
            }
        }
        System.out.println(minNum);
    }
}
