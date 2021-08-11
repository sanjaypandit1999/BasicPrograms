package com.bridglabz.factor.utility;

import java.util.Scanner;

public class Utility {
    public void prime() {
        int number;
        //initialize user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        number = sc.nextInt();
        //using for loop for find nth number of factorial
        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                System.out.println(i + " ");
                number = number / i;
            }
        }
        if(number >2) {
            System.out.println(number);
        }
    }
}
