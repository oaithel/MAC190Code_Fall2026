package com.mac190.average;

import java.util.Scanner;

/*
Write a program that accepts three integers from the user
and displays their average
 */
public class Average {
    public static void main(String[] args) {
        //create a Scanner
        Scanner sc = new Scanner(System.in);
        //ask the user to input three integers
        System.out.println("Enter three integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        double average = (double)(num1 + num2 + num3)/3.0;
        System.out.println("The average of " + num1 + " + " + num2 + " + " + num3 + " is: " + average) ;

    }
}
