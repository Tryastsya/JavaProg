package com.java.class23;

public class TwoDimensionArray {
    public static void main(String[] args) {
        //Declaration and initialization of array
        int data [][] = new int[3][3];

        //Declaration and initialization of array
        int nums [][] = {{1,2,3},{5,4,2},{5,7,1},{4,2,1}};

        //Find
        System.out.println(nums.length); //4 (total qty of mini-arrays)

        System.out.println(nums[0].length); //3 (length of certain array)
        System.out.println();

        for(int i = 0; i< nums.length; i++){
            for(int j = 0; j<nums[i].length; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int []rows:nums){
            for (int d:rows){
                System.out.print(d+" ");
            }
            System.out.println();
        }
    }
}
