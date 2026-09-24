package com.mac190.calculator;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an expression in the form 23 + 34");
        double num1 = sc.nextDouble();
        char op = sc.next().charAt(0);
        double num2 = sc.nextDouble();
        //The same if-else cases can be implemented using a switch statement
        //You can switch only o characters and integers (and strings in Java)
        //you cannot switch on double.
        switch (op){
            case '+' :
            {
                System.out.println(num1 +  " + " + num2 + " = " + (num1 + num2));
                break; //this prevents the switch from going to the next case
            }
            case '-':
            {
                System.out.println(num1 +  " - " + num2 + " = " + (num1 - num2));
                break;
            }
            case '*':
            {
                System.out.println(num1 +  " * " + num2 + " = " + (num1 * num2));
                break;
            }
            case '/':
            {
                if(num2 == 0){
                    System.out.println("Trying to divide by 0!");
                }else{
                    System.out.println(num1 +  " / " + num2 + " = " + (num1 / num2));
                }
                break;
            }
            default:
                System.out.println("Invalid operation");
        }
    }
}
