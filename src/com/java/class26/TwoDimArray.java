package com.java.class26;

public class TwoDimArray {
    public static void main(String[] args) {
        int nums [][]= new int [3][2]; //when we know size of array, but don't know data
        int data [][] = {{1,2,3},{5,3,1},{7,2,5},{8,9,3}}; //when we know data in array

        //Num of rows
        System.out.println(data.length);

        //Num of columns
        System.out.println(data[0].length);

        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }

        for (int[] i : data) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
