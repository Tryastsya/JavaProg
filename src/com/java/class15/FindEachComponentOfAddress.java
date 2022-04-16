package com.java.class15;

public class FindEachComponentOfAddress {
    public static void main(String[] args) {
        String address = "B604, Cosmos Society, Magarpatta City, Pune, 411013";

        String[] addressParts = address.split(",");
        for (int i=0; i< addressParts.length; i++) {
            System.out.println(addressParts[i].trim());
        }
    }
}
