package com.java.homeworks;

public class Homework10 {
    public static void main(String[] args) {
//========================== Find Output of Below Program ================

        int i = 4, j = 4, k = 4;
        int m = i++ + j-- + --k;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
//========================== Find Output of Below Program ================
        i = 4; j = 4; k = 4;
        m = ++i + ++j + --k;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
//========================== Find Output of Below Program ================
        i = 4; j = 4; k = 4;
        i = j++ + --k;
        m = i + j + k;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
//========================== Find Output of Below Program ================
        i = 4; j = 4; k = 4;
        i=j++;
        j=k++;
        k=--i;
        m = i + j + k--;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
    }
}
