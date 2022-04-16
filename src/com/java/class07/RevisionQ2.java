package com.java.class07;

public class RevisionQ2 {
    public static void main(String[] args) {
        int a = 55;

        if(a%10>6) {
            System.out.println("1");
        }else if (a%10<6){
            System.out.println("2");
        }else if (a%10 ==5) {
            System.out.println("3");
        }
       // Even if it's 2 true statements, only the first will be executed
    }
}

