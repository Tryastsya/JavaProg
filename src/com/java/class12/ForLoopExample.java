package com.java.class12;

public class ForLoopExample {
    public static void main(String[] args) {
/*
        int i = 1;                      //initialization

        while (i<=5) {                  //condition
            System.out.println(i);      //body
            i++;                        //Increment/decrement
        }
 */

        for (int i = 1; i<=10; i++){    //initialization + condition + Increment/decrement
            if(i%2==0) {
                System.out.println(i);      //body
            }
        }

        for(int i = 1; i<=10/2; i++) {
            System.out.println(i*2);
        }

        for (int i = 2; i<=10; i=i+2){
            System.out.println(i);
        }
    }
}
