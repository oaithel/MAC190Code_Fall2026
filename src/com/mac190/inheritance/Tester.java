package com.mac190.inheritance;

public class Tester {
    public static void main(String[] args) {
        Point P1 = new Point();
        P1.setXY(2, 4);
        System.out.println("P1: " + P1);
        Point P2 = new Point(3, 5);
        System.out.println("P2: " + P2);
        System.out.println("Distance from P1 to P2: " + P1.distance(P2));
        System.out.println("Distance from P2 to P1: " + Point.distance(P2, P1));
        Point midPoint = P1.add(P2);
        System.out.println("Midpoint: " + midPoint);
        ICircle C1 = new ICircle(P1, 4);
        System.out.println("C1: " + C1 + " perim: " + C1.perimeter() + " area: " + C1.area());
        ICircle C2 = new ICircle(1, 2, 5);
        System.out.println("C2: " + C2 + " perim: " + C2.perimeter() + " area: " + C2.area());
        ICircle C3 = ICircle.add(C1, C2);
        System.out.println("C3: " + C3 + " perim: " + C3.perimeter() + " area: " + C3.area());
        if(P1.equals(C1)){
            System.out.println("P1 is same as C1");
        }else{
            System.out.println("P1 is of course not same as C1");
        }
        if(C1.equals(P1)){
            System.out.println("P1 is same as C1");
        }else{
            System.out.println("P1 is of course not same as C1");
        }

    }
}
