package com.java.class09;

public class PrefixAndPostfix {
    public static void main(String[] args) {
        int i = 5;

        int j = i++; //i++ will be executed AFTER assignment, ++i will be executed BEFORE assignment

        System.out.println(j);
        System.out.println(i);

        i = 1;
        j = 4;
        int k = j++ + i;
        System.out.println(i); //1
        System.out.println(j); //5
        System.out.println(k); //5

        i = 1;
        j = 4;
        //int k = j++ + i++;
        // same will be k=j+i; i++; j++ (increment after expression)
        System.out.println(i); //2
        System.out.println(j); //5
        System.out.println(k); //5

        i = 4;
        j = 4;
        k = i++ + --j;
        int m = k++ - i++;
        System.out.println(i); //6
        System.out.println(j); //3
        System.out.println(m); //2
        System.out.println(k); //8
    }
}
