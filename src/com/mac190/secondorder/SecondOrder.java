package com.mac190.secondorder;

import java.util.Scanner;

/*
Write a Java program that reads the three coefficients of a
second order equation a, b, and c (aX^2 + bX + C = 0)

solve the queation as follows:
Two cases for a
1- a = 0
    - there two cases for b
        - b = 0
            -there are two cases for C
                - c = 0 there for there is infinite number of solution
                - c not 0 there is no solution

        - b not equal to 0
            - we have a first order equation bx + c = 0 to which the
            solution is -c/b
2- a not equal to 0
    - Compute the dicriminant D = b^2 - 4ac
    - There are three different cases
        - D = 0
            There is one doubler solution X = -b/2a
        - D > 0, there are two distinct solutions
                X1 = -b + sqrt(d)/2a,  x2 = -b - sqrt(d)/2a
        - D < 0 no real solutions.


 */
public class SecondOrder {
    public static void main(String[] args) {
        //Get the coefficients from the user
        System.out.println("Enter the coefficients a, b, and c: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("We have 0 = 0 which infinite number of solutions");
                } else { //c!= 0
                    System.out.println("No solution");
                }
            } else {//b != 0
                System.out.println("We have a first order equation the solution is: " + (-c / b));
            }
        } else { //a != 0
            //Compute the discriminant
            double D = Math.pow(b, 2) - 4 * a * c;
            if (D == 0) {
                double X = -b / (2 * a);
                System.out.println("There is one double solution: " + X);
            } else if (D > 0) {
                double X1 = (-b + Math.sqrt(D)) / (2 * a);
                double X2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("There are two distinct solutions: X1 = " + X1 + ", X2 = " + X2);
            } else { //D < 0
                System.out.println("The are no real solutions");
            }
        }
    }
}

