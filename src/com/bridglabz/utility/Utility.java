package com.bridglabz.utility;

public class Utility {
    public void checkLeapYear(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public void fourDigit(int year){
        if (year>999 && year<9999){
            System.out.println("It's four digit number");
        }
        else
            System.out.println("it's not a four digit number");
    }
}