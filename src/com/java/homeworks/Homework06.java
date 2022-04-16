package com.java.homeworks;

import java.util.Scanner;

/*
Write a program to take username and password from user and print appropriate message
based on below conditions
	1. If username correct and password correct ---> Login successful
	2. If username correct and password incorrect --> Invalid password
	3. If username incorrect and password correct --> Invalid username
	2. If username incorrect and password incorrect --> Login unsuccessful
 */
public class Homework06 {
    public static void main(String[] args) {
        String username = "Oleh";
        String password = "qwerty";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String usernameInput = sc.nextLine();
        System.out.println("Please enter your password:");
        String passwordInput = sc.nextLine();

        if(username.equals(usernameInput) && password.equals(passwordInput)) {
            System.out.println("Login successful");
        }else if(username.equals(usernameInput) && !password.equals(passwordInput)) {
            System.out.println("Invalid password");
        }else if(!username.equals(usernameInput) && password.equals(passwordInput)) {
            System.out.println("Invalid username");
        }else {
            System.out.println("Login unsuccessful");
        }
    }
}
