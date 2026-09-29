package com.mac190.loops;

import java.util.Scanner;

/*
Write a Java program that keeps reading an integer from the
uuser for as long as the input is positive and quits once the input is
negative and displays the largest and the smallest value entered.
example:
enter a value: 3
enter a value: 32
enter a value: 13
enter a value: 1
enter a value: 44
enter a value: 34
enter a value: 53
enter a value: -3
The largest value is: 53 and the smallest is: 1


 */
public class Example1Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //read a first value.
        System.out.println("Enter an integer: ");
        int value = sc.nextInt();
        int largest = value;
        int smallest = value;
        while(value >= 0){
            if(value < smallest){
                smallest = value;
            }
            if(value > largest){
                largest = value;
            }
            System.out.println("Enter an integer: ");
            value = sc.nextInt();
        }
        System.out.println("Smallest: " + smallest + " Largest: " + largest);
    }
}
