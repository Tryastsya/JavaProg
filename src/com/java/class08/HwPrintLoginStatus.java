package com.java.class08;

import java.util.Scanner;

public class HwPrintLoginStatus {
    public static void main(String[] args) {

        System.out.println("Enter your username and password");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine(), password = sc.nextLine();
        String expUsername = "Devx", expPassword = "Spring2022";

        if (username == expUsername) {
            if (password == expPassword) {
                System.out.println("Login successful");
            } else {
                System.out.println("Username invalid");
            }
        }else {
            if (password == expPassword) {
                System.out.println("Password invalid");
            } else {
                System.out.println("Login unsuccessful");
            }
        }
    }
}



