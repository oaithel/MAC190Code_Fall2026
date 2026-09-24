package com.mac190.calculator;

import java.util.Scanner;

/*
Write a Java program that accepts an input in the form double operator double
23.4 + 45.6
and performs the operation and displays the result. The operator could be
+ - / or *
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an expression in the form 23 + 34");
        double num1 = sc.nextDouble();
        char op = sc.next().charAt(0);
        double num2 = sc.nextDouble();

        if(op == '+'){
            System.out.println(num1 +  " + " + num2 + " = " + (num1 + num2));
        }else if(op == '-'){
            System.out.println(num1 +  " - " + num2 + " = " + (num1 - num2));
        }else if (op == '*'){
            System.out.println(num1 +  " * " + num2 + " = " + (num1 * num2));
        }else if(op == '/'){
            if(num2 == 0){
                System.out.println("Trying to divide by 0!");
            }else{
                System.out.println(num1 +  " / " + num2 + " = " + (num1 / num2));
            }
        }else{
            System.out.println("Invalid operation");
        }
    }
}
