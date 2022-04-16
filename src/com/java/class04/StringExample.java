package com.java.class04;

public class StringExample {
    public static void main(String[] args) {
        int a =10 , b=20;
        String str1 = "Hello!";
        String str2 = "Java";

        System.out.println(a);
        System.out.println(str1+str2);
        System.out.println(str1+a+b);
        System.out.println(a+b+str1);
        // str + int + int = (str+int) + int = str + int = str
        // int + int + str = (int+int) + str = str
        System.out.println("a+b");
        System.out.println(str1+a*b); //priority of *
        // System.out.println(str1+a-b); - error
        System.out.println(a-b+str1);
    }
}
