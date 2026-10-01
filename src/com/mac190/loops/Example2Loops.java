package com.mac190.loops;

import java.util.Scanner;

/*
Write a Java program similar to the previous one where the user
enters an integer for as long as the input is positive and the program
displays the number of odd numbers and even numbers entered as well
as the number of pairs of numbers entered.
Example if the input is the following:
2, 4, 5, 5, 5, 6, 5, 5, 7, 8, 8, 8, -3
The program should display: There are 6 even numbers and
6 odd numbers and 3 pairs of numbers.
 */
public class Example2Loops {
    public static void main(String[] args) {
        int oddCounter = 0;
        int evenCounter = 0;
        int pairsCounter = 0;
        int previous = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (negative to exit): ");
        int number = scanner.nextInt();
        boolean bPairsPrevious = false;
        while (number >= 0) {
            if (number % 2 == 0) { //even???
                evenCounter++;
            } else {
                oddCounter++;
            }
            /*
            if (number == previous) {
                pairsCounter++;
                previous = -1;
            }else {
                previous = number;
            }

             */
            if (number == previous && bPairsPrevious == false){
                pairsCounter++;
                bPairsPrevious = true;
            } else {
                bPairsPrevious = false;
            }
            previous = number;
            System.out.println("Enter a number (negative to exit): ");
            number = scanner.nextInt();
        }
        System.out.println("There are " + evenCounter + " even numbers and " + oddCounter + " odd numbers and " + pairsCounter + " pairs");
    }
}
