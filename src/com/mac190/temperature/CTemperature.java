package com.mac190.temperature;
/*
design a class CTemperature that has a variable for the temperature
and one for the format. And a method convert that converts the
temperature to the appropriate one and displays it
Change the main to use object from this class.
 */
public class CTemperature {
    //member variable for temperature
    double temperature;
    //member variable for the format
    char format;
    //method covert
    public void convert(){
        //if format is c convert to fahrenheit
        //if format is f convert to celcius
        //else invalid format
        if (Character.toLowerCase(format) == 'c') {
            //convert from celcius to fahrenheit
            double fah = temperature * (9.0 / 5.0) + 32;
            //display the result
            System.out.println(temperature + " Celcius is " + fah + " Fahreneit");
        } else if (Character.toUpperCase(format) == 'F') {
            //do the opposite
            double celcius = (temperature - 32) * (5.0 / 9.0);
            System.out.println(temperature + " Fahrenheit is " + celcius + " Celcius");
        } else {
            System.out.println("Invalid format");
        }
    }
}
