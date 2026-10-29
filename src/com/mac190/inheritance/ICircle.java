package com.mac190.inheritance;
/*
Inheritance allows you to inherit all member variables and methods of another
class. No need to rewrite the previous class data or logic.
You can use inheritance only when there is a one-to-one correspondence.
Rule of thumb is: If you answer the question waht is Class B in terms of
Class B IS Class A augmented by more data and methods then inheritance
should be used. If the answer is Class B HAS one or many of Class A then
composition should be used.
Every Circle IS a Point augmented by a radius, we can use inheritance.
When Circle inherits Point, it inherits all data of Point and methods as well.
x, y are inherited no need to redefine them.
getX, getY, setX, setY, setXY, distance all these methods are inherited
To specify inheritance we use the keyword extends
Now every Circle IS a Point object as well.

 */

import java.util.Objects;

public class ICircle extends Point{
    private double radius;

    public ICircle(){
        super();//this constructs the Point within the Circle
        radius = 0;
    }
    public ICircle(double a){
        super();
        radius = a;
    }
    public ICircle(double a, double c){
        super(a);
        radius = c;
    }
    public ICircle(double a, double b, double c){
        super(a, b);
        radius = c;
    }
    public ICircle(Point a, double c){
        super(a);//using a copy constructor
        radius = c;
    }
    //copy constructor
    public ICircle(ICircle c){
        super(c);//using a copy constructor, c is a Point object
        radius = c.radius;
    }
    //getters
    public Point getCenter() {
        return this;//this is a ICircle and IS a Point as well
    }
    public void setCenter(Point p){
        this.setXY(p.getX(), p.getY());
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double a){
        radius = a;
    }

    //toString
    public String toString(){
        return "[" + super.toString() +", " + radius + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ICircle iCircle)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(radius, iCircle.radius) == 0;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*Math.pow(radius, 2);
    }
    public ICircle add(ICircle c){
        return new ICircle(super.add(c), this.radius + c.radius);
    }
    public static ICircle add(ICircle t, ICircle c){
        return new ICircle(t.getCenter().add(c.getCenter()), t.radius + c.radius);
    }

}
