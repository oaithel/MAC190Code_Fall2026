package com.mac190.vehicle;
/*
An interface same as an abstract class wigth all methods abstract.
You are not allowed however to define variables, except
static variables.
All methods defined in an interface HAVE to be declared public
in the implementing class.
 */
public interface iDrive {
    void setMake(String s);
    void setModel(String s);
    void setVIN(String s);
    void turnRight(double degrees);
    void turnLeft(double degrees);
    void brake(); //puts the car into a stop mode.
    boolean speedUp(double speed);
    boolean moveBackwards();
    boolean moveForward();
    double getSpeed();
}
