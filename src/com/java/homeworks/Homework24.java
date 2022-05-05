/*
Find the Transpose of Matrix (interchanging its rows into columns or columns into rows)
Example Input
1 2 3
4 5 6
7 8 9
Output
1 4 7
2 5 8
3 6 9
 */
package com.java.homeworks;

public class Homework24 {
    public static void main(String[] args) {
        int data[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Example input:");
        for(int i=0; i< data.length; i++){
            for(int j=0; j<data[i].length; j++){
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Interchanged output:");
        for(int i=0; i< data.length; i++){
            for(int j=0; j<data[i].length; j++){
                System.out.print(data[j][i]+" ");
            }
            System.out.println();
        }
    }
}
