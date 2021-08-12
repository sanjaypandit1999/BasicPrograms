package com.bridglabz.oddeven;

/**
 * Check given number is odd or even
 *
 * @author Sanjay
 * @version 1.8
 * @since 12-08-2021
 */

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int n;
        //user input
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        n = s.nextInt();
        //programing construction
        if(n % 2 == 0)
        {
            System.out.println("The given number "+n+" is Even ");
        }
        else
        {
            System.out.println("The given number "+n+" is Odd ");
        }
    }
}
