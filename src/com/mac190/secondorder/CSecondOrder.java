package com.mac190.secondorder;
/*
TODO: HW5 Implement the secondOrder equation program as a class.
 */
public class CSecondOrder {
    double a, b, c;

    public void solve(){
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
