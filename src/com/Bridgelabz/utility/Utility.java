package com.Bridgelabz.utility;

import java.util.Scanner;

public class Utility {
    public void value() {
        Scanner sc = new Scanner(System.in);
        System.out.println("The power of value N:- ");
        int num = sc.nextInt();
        int i = 0;                // count from 0 to N
        int powerOfTwo = 1;       // the ith power of two

        // repeat until i equals n
        while (i <= num) {
            System.out.println("2 to the power " + i );
            System.out.println(powerOfTwo);   // print out the power of two
            powerOfTwo = 2 * powerOfTwo;                // double to get the next one
            i = i + 1;
        }
    }
}

