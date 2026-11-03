package com.mac190.midtermreview;
/*
Implement Cube class using inheritance, keep the same tester.
The class should behave exactly as Cube class.
Every ICube is a Rectangle.
 */
public class ICube extends Rectangle{
    private double height;
    //default constructor
    public ICube(){
        super();
        height = 0;
    }
    public ICube(double a){
        super(a);
        height = a;
    }
    public ICube(double a, double b, double c){
        super(a, b);
        height = c;
    }
    public ICube(Rectangle R, double a){
        super(R);
        height = a;
    }
    //copy constructor
    public ICube(ICube c){
        super(c); //because c is ICube therefore it is a Rectangle as well
        height = c.getHeight();
    }

    public Rectangle getBase() {
        return this; //because the object itself is a Rectangle
    }
    public void setBase(Rectangle base) {
        this.setLength(base.getLength());
        this.setWidth(base.getWidth());
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "ICube{" +
                "base=" + super.toString() +
                ", height=" + height +
                '}';
    }
    public boolean equals(ICube C){
        if(C == null) return false;
        return super.equals(C) && this.height == C.height;
    }
    public double area(){
        return super.area()*2 + 2*this.getLength()*height + 2*this.getWidth()*height;
    }
    public double volume(){
        return super.area() *height;
    }
    public ICube add(ICube C){
        return new ICube(super.add(C), this.height + C.height);
    }
    //as static method
    public static ICube add(ICube T, ICube C){
        return new ICube(T.getBase().add(C), T.height + C.height);
    }
}