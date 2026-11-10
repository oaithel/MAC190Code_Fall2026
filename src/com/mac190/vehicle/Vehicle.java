package com.mac190.vehicle;

import java.util.Objects;

/*
Design an abstract class Vehicle that has the following:
VIN number,
make (the brand)
fuelType
setters/getters

Methods, you want any derived class to implement the following methods
void turnRight(double degrees);
void turnLeft(double degrees);
void brake(); //puts the car into a stop mode.
boolean speedUp(double speed);
boolean moveBackwards();
boolean moveForward();
*/
abstract class Vehicle {
    private String VIN;
    private String make;
    private char fuelType;
    protected double speed;

    public Vehicle(){
        VIN = "N/A";
        make = "N/A";
        fuelType = '?';
        speed = 0;
    }
    public Vehicle(String v, String m, char f){
        VIN = v;
        make = m;
        fuelType = f;
        speed = 0;
    }

    public double getSpeed() {
        return speed;
    }
    //no setSpeed, method will change the speed.
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public char getFuelType() {
        return fuelType;
    }
    public void setFuelType(char fuelType) {
        this.fuelType = fuelType;
    }
    public String getVIN() {
        return VIN;
    }
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VIN='" + VIN + '\'' +
                ", make='" + make + '\'' +
                ", fuelType=" + fuelType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;
        return fuelType == vehicle.fuelType && Objects.equals(VIN, vehicle.VIN) && Objects.equals(make, vehicle.make);
    }
/*
We would like to force every derived class to implement
the following methods.
 */
    abstract void turnRight(double degrees);
    abstract void turnLeft(double degrees);
    abstract void brake(); //puts the car into a stop mode.
    abstract boolean speedUp(double speed);
    abstract boolean moveBackwards();
    abstract boolean moveForward();
}
