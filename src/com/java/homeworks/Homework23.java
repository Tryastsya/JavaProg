/*
Find sum of Individual row in 2D array
Example input:
3 4 6
7 6 4
9 9 2
Output :
Sum of  row1 = 13
Sum of  row2 = 17
Sum of row3 = 20
 */

package com.java.homeworks;

public class Homework23 {
    public static void main(String[] args) {
        int data[][] = {{12,4,1},{2,15,9},{11,10,8}};
        for(int i = 0; i< data.length; i++){
            int sumRow = 0;
            for(int j = 0; j< data[i].length; j++){
                sumRow = sumRow+data[i][j];
            }
            System.out.println("Sum of row "+(i+1)+" = "+sumRow);
        }
    }
}
