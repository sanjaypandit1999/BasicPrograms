package com.remainder.utility;

import java.util.Scanner;

public class Utility {
    public void calculation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num1:- ");
        int num1 = sc.nextInt();
        System.out.println("enter the num2:- ");
        int num2 = sc.nextInt();
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
    }
}
