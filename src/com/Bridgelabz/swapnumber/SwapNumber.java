package com.Bridgelabz.swapnumber;

/**
 * Swap to number
 *
 * @author Sanjay
 * @version 1.7
 * @since 12-08-2021
 */

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        int x, y, t;// declare a integer value x,t and y;
        //take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X and Y");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("before swapping numbers: "+x +"  "+ y);
        //swapping logic
        t = x;
        x = y;
        y = t;
        System.out.println("After swapping: "+x +"   " + y);
    }
}
