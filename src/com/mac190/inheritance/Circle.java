package com.mac190.inheritance;
/*
Design a class Circle that has the following properties:
private Point center and double radius.
- default constructor that creates a center as default
Point
- constructor accepting one double and creates a default center and assigns the
input to the radius.
- constructor accepting two double values, creates a center with the first value and assigns the second
to the radius
- Constructor accepting three doubles the first two for the center and
the third for the radius
- constructor accepting a Point and a double and
creates a center as the copy of the point and assigns the
double value to the radius
- A copy constructor.
- getters: getCenter, getRadius, getX returns x of the center
getY returns y of the center.
//setters: setCenter(Point p), setRadius, setX and setY
- toString
- equals, use equals in Point class to compare the two centers
- method double perimeter() (2 Pi R) and double area() (Pi R^2)
- method Circle add(Circle p) returns a Circle with a center as
 the midpoint of the two centers and the radius as the sum of the radii
- implement the add method above as static
- Test both classes.
 */

import java.util.Objects;

public class Circle {
    private Point center;
    private double radius;

    public Circle(){
        center = new Point();
        radius = 0;
    }
    public Circle(double a){
        center = new Point();
        radius = a;
    }
    public Circle(double a, double c){
        center = new Point(a);
        radius = c;
    }
    public Circle(double a, double b, double c){
        center = new Point(a, b);
        radius = c;
    }
    public Circle(Point a, double c){
        center = new Point(a);//using a copy constructor
        radius = c;
    }
    //copy constructor
    public Circle(Circle c){
        center = new Point(c.center);//using a copy constructor
        radius = c.radius;
    }
    //getters
    public Point getCenter() {
        return center;
    }
    public void setCenter(Point p){
        center = p;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double a){
        radius = a;
    }
    public double getX(){
        return center.getX();
    }
    public double getY(){
        return center.getY();
    }
    public void setX(double a){
        center.setX(a);
    }
    public void setY(double a){
        center.setY(a);
    }
    public void setXY(double a, double b){
        center.setXY(a, b);
    }
    //toString
    public String toString(){
        return "[" + center.toString() +", " + radius + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0 && this.center.equals(circle.center);
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*Math.pow(radius, 2);
    }
    public Circle add(Circle c){
        return new Circle(this.center.add(c.center), this.radius + c.radius);
    }
    public static Circle add(Circle t, Circle c){
        return new Circle(t.center.add(c.center), t.radius + c.radius);
    }

}
