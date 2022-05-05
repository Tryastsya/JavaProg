package com.java.homeworks;

public class Homework21 {
    public static void main(String[] args) {
        int data[] = {35, 33, 75, 43, 23, 67, 55};

        System.out.println(getAvgOfNumber(data));
        System.out.println(getSumOfNumber(data));
        System.out.println(getMaximum(data));
        System.out.println(getIndexOfNumber(data, 23));
    }

    static double getAvgOfNumber(int data[]) {
        double sum=0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        return sum/data.length;
    }

    static int getSumOfNumber(int data[]) {
        int sum=0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        return sum;
    }

    static int getIndexOfNumber(int data[], int num) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == num) {
                return i;
            }
        }
        return -1; //Standart message for array error
    }

    static int getMaximum(int data[]) {
        int max = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }

        return max;
    }
}