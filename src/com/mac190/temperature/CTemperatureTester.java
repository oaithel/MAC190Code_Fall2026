package com.mac190.temperature;

import java.util.Scanner;

public class CTemperatureTester {
    public static void main(String[] args) {
        //create a Scanner
        Scanner sc = new Scanner(System.in);
        //ask the user for the temperature
        //get the temperature temp
        char answer = 'y';
        while (Character.toLowerCase(answer) == 'y') {
            CTemperature temp = new CTemperature();
            System.out.println("Enter the temperature to convert: ");
            temp.temperature = sc.nextDouble();
            //ask the user which format is the temperature
            //f for fahrenheit and c for celcius
            System.out.println("Press C if the temperature is in Celcius \n" +
                    "Press F if the temperature is in Fahrenheit: ");
            //get the format
            temp.format = sc.next().charAt(0);

            temp.convert();
            System.out.println("Press y if you want to continue: ");
            answer = sc.next().charAt(0);
        }
    }
}
