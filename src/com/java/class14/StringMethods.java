package com.java.class14;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello World";
        String str3 = "Hello World! Welcome to DevX!";

        //1. Equality of two strings
        System.out.println("1 "+str1.equals(str2));

        //2. Equality of two strings ignoring case
        System.out.println("2 "+str1.equalsIgnoreCase(str2));

        //3. Check one string contains another string
        System.out.println("3 "+str1.contains(str3)); //false
        System.out.println("3 "+str3.contains(str1)); //true
        System.out.println("3 "+str3.contains(str2)); //false - case sensitive

        //3.1 Checking/comparing content of strings with ignoring case
        String str3LowerCase = str3.toLowerCase();
        String str2LowerCase = str2.toLowerCase();
        System.out.println("3.1 "+str3LowerCase.contains(str2LowerCase));
        System.out.println("3.1 "+str3.toUpperCase().contains(str2.toUpperCase()));

        //4. Changing the case of string
        System.out.println("4 "+str1.toUpperCase()); //Upper Case
        System.out.println("4 "+str1.toLowerCase()); //Lower Case

        //5. Find index of character
        System.out.println("5 "+str1.indexOf('W'));
        System.out.println("5 "+str3.lastIndexOf('W'));

        //6. Find character in index
        System.out.println("6 "+str1.charAt(4));

        //7. Length of the string
        System.out.println("7 "+str1.length());
        System.out.println("7 "+str3.length());

        //8. Checking emptyness of string
        str1 = "     ";     // 5 spaces
        str3 = "";          // 0 spaces
        System.out.println("8.1 "+str1.length());
        System.out.println("8.2 "+str1.isEmpty());
        System.out.println("8.3 "+str3.length());
        System.out.println("8.4 "+str3.isEmpty());
        System.out.println("8.5 "+str1.isBlank()); //Java11 and higher

        //9. Replace and ReplaceAll
        str1 = "9 Welcome User";
        str3 = "Devx";
        Scanner sc = new Scanner(System.in);
        System.out.println(str1);
        System.out.println("9 Please enter your name:");
        //str3 = sc.nextLine();
        System.out.println(str1.replace("User",str3+"!"));

        str1 = "INR 200 INR 300 INR 500";
        System.out.println("9.1 "+str1.replaceAll("[A-Za-z ]", ""));
        System.out.println("9.1 "+str1.replaceAll("[0-4]",""));
        System.out.println("9.1 "+str1.replaceAll("[0-9 ]",""));
        System.out.println("9.1 "+str1.replaceAll("INR","USD"));

        //10. Format
        str1 = "Welcome %s, Welcome to %s";
        System.out.println("10 "+ String.format(str1, "Oleh", "Ebay"));

        //11. SubString
        str1 = "Welcome to java class. Today is a fun day!";
        System.out.println("11 "+ str1.substring(9));
        System.out.println("11 "+ str1.substring(0,9));


        //12. Split
        str1 = "Welcome to java class";
        String[] words = str1.split(" ");
        System.out.println("12 "+words[0]);
        System.out.println("12 "+words[2]);
        System.out.println("12 "+words[0]+words[1]+words[2]+words[3]);

        str1 = "Welcome      to java class";
        words = str1.split(" ");
        System.out.println("12 "+words[0]+words[1]+words[2]+words[3]);

        str1 = "Welcome to java class";
        words = str1.split(" ");
        for(int i=0; i<=3; i++){
            System.out.println(words[i]);
        }

        str1 = "Welcome to java class";
        System.out.println("12.1 " + words.length);

        str1 = "Welcome to java class. Today is a fun day!";
        words = str1.split(" ");
        System.out.println("12.1 " + words.length);

        //
        System.out.println("12.2 "+str1.length());

        for (int i=0; i< words.length; i++){
            System.out.println(words[i]);
        }

    }
}
