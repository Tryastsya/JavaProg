package com.java.class24;

public class FindMaxInEachRow {
    public static void main(String[] args) {
        int data[][]={{100, 13, 3},{-24,-51,-36},{70,28,59}};

        for(int i= 0;i<data.length; i++){
            int max = data[i][0];
            for(int j=0; j<data[i].length; j++){
                if(data[i][j]>max) {
                    max = data[i][j];
                }
            }
            System.out.println("Max number in row "+(i+1)+" is "+max);
        }
    }
}
