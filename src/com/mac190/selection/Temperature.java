package com.mac190.selection;

import java.util.Scanner;

/*
Write a Java program that reads a temperature from the user and
it's format (F: for fahrenheit and C: for Celcius). Covert the
temperature to the appropriate one (fah to celcius or celcius to fah)
 Celcius = Fahrenheit - 32 multiplied by 4/9.
 fah = celcius multiplied by 9/4 add 32.
 */
public class Temperature {
    public static void main(String[] args) {
        //create a Scanner
        Scanner sc = new Scanner(System.in);
        //ask the user for the temperature
        //get the temperature temp
        System.out.println("Enter the temperature to convert: ");
        double temperature = sc.nextDouble();

        //ask the user which format is the temperature
        //f for fahrenheit and c for celcius
        System.out.println("Press C if the temperature is in Celcius \n" +
                "Press F if the temperature is in Fahrenheit: ");
        //get the format
        char format = sc.next().charAt(0);

        //check if the format is celcius, then
        if(Character.toLowerCase(format) == 'c') {
            //convert from celcius to fahrenheit
            double fah = temperature*(9.0/5.0) + 32;
            //display the result
            System.out.println(temperature + " Celcius is " + fah + " Fahreneit");
        }else if(Character.toUpperCase(format) == 'F'){
            //do the opposite
            double celcius = (temperature -32)*(5.0/9.0);
            System.out.println(temperature + " Fahrenheit is " + celcius + " Celcius");
        }else{
            System.out.println("Invalid format");
        }
    }
}
