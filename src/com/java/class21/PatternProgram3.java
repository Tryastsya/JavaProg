package com.java.class21;

public class PatternProgram3 {
    public static void main(String[] args) {
       /* for(int i = 1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                if(5-j>=i) {
                    System.out.print(" ");
                }else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }*/

        for(int i = 1; i<=10; i++){
            for(int s = 1; s<=10-i; s++){
                System.out.print(" ");
            }

            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }

            for(int k = i-1; k>=1; k--){
                System.out.print(k);
            }

            System.out.println();
        }

        for(int i = 1; i<=5; i++){
            for(int s = 1; s<=9-i; s++){
                System.out.print(" ");
            }

            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }

            for(int k = 1; k<i; k++){
                System.out.print(i-k);
            }

            System.out.println();
        }
    }
}
