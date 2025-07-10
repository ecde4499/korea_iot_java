package org.example.chapter02;

public class Z_Review {
    public static void main(String[] args) {
        //      *****
        //      ****
        //      ***
        //      **
        //      *

        //      *****
        //       ****
        //        ***
        //         **
        //          *

        for(int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int bl = 0;
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j < bl + i ; j++) {
                System.out.print(" ");
            }
            for(int k = 5; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
