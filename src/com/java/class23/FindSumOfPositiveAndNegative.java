package com.java.class23;

public class FindSumOfPositiveAndNegative {
    public static void main(String[] args) {
        int data[] = {5, 8, 2, -4, -13, 3, -7, 12};
        int sumPos = 0, sumNeg = 0;
            for (int i = 0; i<data.length; i++){
                if(data[i]>0){
                    sumPos = sumPos+data[i];
                }else{
                    sumNeg = sumNeg+data[i];
                }
            }
        System.out.println("Sum of positive numbers: "+sumPos);
        System.out.println("Sum of negative numbers: "+sumNeg);
    }
}
