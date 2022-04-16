// Find the factorial of the number
package com.java.homeworks;
import java.util.Scanner;
public class Homework17 {
    public static void main(String[] args) {
        System.out.println("Please enter number to get factorial:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long fc = 1;
        for(int i = 1; i<=num; i++){
            fc =i*fc;
            if (fc<0) {
                System.out.println("Oh, my CPU is exploding! Sorry, I can't calculate such huge numbers!.. :)");
            break;
            }
        }
        if(fc>0){
            System.out.println(num + "(!) is " + fc);
        }
    }
}
