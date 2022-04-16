package com.java.class07;

import java.util.Scanner;

public class PrintDiscountBasedOnPrice {
    public static void main(String[] args) {
        System.out.println("Please enter a price to get your discount:");
        Scanner sc5 = new Scanner(System.in);
        int price = sc5.nextInt();
        int discount = 0;

        if (price>0 && price<100) {
           discount = 0;
        }else if(price>=100 && price<500 ){
            discount = 5;
        }else if(price>=500 && price<1000){
            discount = 10;
        }else if(price>=1000) {
            discount = 15;
        }else{
            System.out.println("Please enter correct price");
        }

        switch (discount) {
            case 0:
                System.out.println("Sorry, you haven't any discount");
                break;
            case 5:
                System.out.println("Your discount is 5%");
                break;
            case 10:
                System.out.println("Your discount is 10%");
                break;
            case 15:
                System.out.println("Your discount is 15%");

        }
    }
}
