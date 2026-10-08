package com.mac190.secondorder;

import java.util.Scanner;

public class SecondOrderTester {
    public static void main(String[] args) {
        char answer = 'y';
        while(Character.toLowerCase(answer) == 'y') {
            CSecondOrder second = new CSecondOrder();
            System.out.println("Enter the coefficients a, b, and c: ");
            Scanner sc = new Scanner(System.in);
            second.a = sc.nextDouble();
            second.b = sc.nextDouble();
            second.c = sc.nextDouble();
            second.solve();
            System.out.println("Do you want to run the program again? [Y/N]: ");
            answer = sc.next().charAt(0);
        }
    }
}
