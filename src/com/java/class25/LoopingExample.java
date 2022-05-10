package com.java.class25;

public class LoopingExample {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 3; i<=7; i++){
            count++;
        }
        System.out.println(count);

        count = 0;
        for(int i = 3; i<=7; i++){
            if(count%2==1) {
                count++;
            }
        }
        System.out.println(count);

        count = 0;
        for(int i = 3; i<=7; i++){
            for(int j=1; j<=i; j++){
                System.out.println("Hello");
            }
        }

        for(int i = 3; i<=7; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        for(int i = 3; i<=7; i++){
            for(int j=1; j<=i; j++){
            }
            System.out.print(i);
            System.out.println();
        }



    }
}
