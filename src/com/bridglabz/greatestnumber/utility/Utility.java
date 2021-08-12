package com.bridglabz.greatestnumber.utility;
/**
 * find largest amongthe three numbers
 *
 * @authuor Sanjay
 * @version 1.10
 * @since  12-08-2021
 */

import java.util.Scanner;

public class Utility {
    public void greatest(){
        // initialize variable
        int x, y, z;
        // take user input
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();
        //programing constraction
        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }
    }
}
