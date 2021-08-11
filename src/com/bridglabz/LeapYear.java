package com.bridglabz;

import com.bridglabz.utility.Utility;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Utility utility = new Utility();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:- ");
        int year = sc.nextInt();
        utility.fourDigit(year);
        utility.checkLeapYear(year);
        utility.fourDigit(year);
    }
}
