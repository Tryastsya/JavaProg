package com.java.class15;

import java.util.Scanner;

public class PrintInitials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name:");
        String fullName = sc.nextLine();
        String[] names = fullName.split(" ");
        System.out.println("Your initials is:");
        for(int i=0; i< names.length; i++){
            System.out.print(names[i].charAt(0)+".");
        }
    }
}
