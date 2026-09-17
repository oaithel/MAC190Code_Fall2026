package com.mac190.inputs;

import java.util.Scanner;

/*
To read data from the user, you need to use a Scanner object
1- Create an object Scanner
2- Display an invite for the user to know what is expected from him/her
3- read the data into a variable.
 */
public class Inputs {
    public static void main(String[] args) {
        //let's read the number of students in the class.
        //create a Scanner
        Scanner keyb = new Scanner(System.in); //System.in is the keyboard
        //Display an invite for the user
        System.out.println("Enter the number of students: ");
        int numberOfStudents = keyb.nextInt();
        System.out.println("The number of students is: " + numberOfStudents);
        System.out.println("Enter the change in your pocket: ");
        float changeInPocket = keyb.nextFloat();
        System.out.println("You have $" + changeInPocket + " in your pocket");
        //to read a character, we read a word then we extract the firt character
        //of that word.
        System.out.println("Is it or not? [y/n]: ");
        char answer = keyb.next().charAt(0);
        System.out.println("You answer is: " + Character.toLowerCase(answer));

    }
}
