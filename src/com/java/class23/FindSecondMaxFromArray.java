package com.java.class23;

public class FindSecondMaxFromArray {
    public static void main(String[] args) {
        int data[] = {35, 33, 75, 43, 23, 67, 57};
        int max1 = 0, max2 = 0;

        for(int i = 0; i< data.length; i++){
            if(data[i]>max1){
                max1 = data[i];
            }else if(data[i]>max2)
                max2 = data[i];
        }
        System.out.println("Second biggest number in array is: "+max2);
    }
}
