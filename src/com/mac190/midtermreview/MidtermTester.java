package com.mac190.midtermreview;

public class MidtermTester {
    public static void main(String[] args) {
        //create a default rectangle
        Rectangle R1 = new Rectangle();
        System.out.println("R1: " + R1);

        R1.setLength(23);
        R1.setWidth(4);
        System.out.println("R1: " + R1 + " Perim: " + R1.perim() + " area: " + R1.area());
        //make a copy of R1
        Rectangle R2 = new Rectangle(R1);
        System.out.println("R2: " + R2);
        //create R3 as the sum of R1 and R2
        Rectangle R3 = R1.add(R2);
        System.out.println("R3: " + R3);
        //using the static add method
        R1 = Rectangle.add(R1, R2);
        System.out.println("R1: " + R1 + " Perim: " + R1.perim() + " area: " + R1.area());
        ICube C1 = new ICube(R1, 23);
        System.out.println("C1: " + C1);
        ICube C2 = new ICube(C1);
        System.out.println("C2: " + C2);
        //using the static method add, add C2 to C1.
        C1 = ICube.add(C1, C2);
        System.out.println("C1: " + C1);
        //Make a Cube C3 that is the sum of C2 and a Cube made of R2 and 10,
        //first do it in two instructions, then do it using only ONE instruction.
        /*
        Cube temp = new Cube(R2, 10);
        Cube C3 = C2.add(temp);
         */
        ICube C3 = C2.add(new ICube(R2, 10));
        System.out.println("C3: " + C3);
    }
}
