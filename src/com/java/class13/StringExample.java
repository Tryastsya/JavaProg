package com.java.class13;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Hello";                          //constant value (storing in the String pool)
        String str2 = sc.nextLine();                    //Object (storing in the heap memory)
        String str3 = new String("Hello");      //Object (storing in the heap memory)

        //String - immutable
        //We cannot change value of String once we it initialized in the memory

        //WHen we compare Strings with == it will compare memory location of two String
        //We can compare String with == only if its initialized as immutable String

        /*When we create two String variables with the same constant value, java will create one value in String pool memory and
        both variables will point to the same memory location because it has same value. So comparing that variables using '=='
        will give you true */

        if(str1.equals(str2)) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
