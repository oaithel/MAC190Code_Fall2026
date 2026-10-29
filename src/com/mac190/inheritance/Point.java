package com.mac190.inheritance;
/*
Design a class Point that has the following properties:
two private double members x and y coordinates
- default constructor toset both to 0
- constructor accepting one double and assigns the value to both x and y
- constructor accepting two double values assigns the
first to x and the second to y
- A copy constructor
- getters/setters
- toString
- equals
- method double distance accepting another point and
returns the ditance between this point and the input point.
ssquare root of: square of difference in x + square of difference in y
- method Point add(Point p) returns a point that is a mid point
between this and p (average of Xs and average of Ys).
- implement both methods above as static
 */
public class Point {
    private double x, y;

    //constructors
    public Point(){
        x = y = 0;
    }
    public Point(double a){
        x = y = a;
    }
    public Point(double a, double b){
        x = a;
        y = b;
    }
    public Point(Point p){
        x = p.x;
        y = p.y;
    }

    //getters
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double a, double b){
        x = a;
        y = b;
    }
    @Override
    public String toString() {
        return "(" + x +
                ", " + y + ")";
    }
    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Point point = (Point) object;
        return Double.compare(x, point.x) == 0 && Double.compare(y, point.y) == 0;
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x-p.x, 2) + Math.pow(this.y - p.y, 2));
    }
    public static double distance(Point t, Point p){
        return Math.sqrt(Math.pow(t.x-p.x, 2) + Math.pow(t.y - p.y, 2));
    }

    public Point add(Point p){
        return new Point((this.x+p.x)/2.0, (this.y+p.y)/2.0);
    }
    public static Point add(Point t, Point p){
        return new Point((t.x+p.x)/2.0, (t.y+p.y)/2.0);
    }
}
