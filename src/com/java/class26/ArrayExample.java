package com.java.class26;

public class ArrayExample {
    public static void main(String[] args) {
        int [] numss = new int [5]; //fixed size of array
        int [] nums = {20, 10, 12, 60, 40};

        for (int i = 0; i< nums.length; i++){
            System.out.println(nums[i]);
        }
        for (int i: nums){
            System.out.println(i);
        }
        System.out.println(nums.length);
    }
}
