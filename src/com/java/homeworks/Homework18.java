package com.java.homeworks;

public class Homework18 {
    public static void main(String[] args) {
        for (int i = 1; i<=50; i++){
            if(isNum5Div(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isNum5Div(int num){
        int count = 0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
            }
        }
        if (count>=5) {
            return true;
        }else {
            return false;
        }
    }
}
