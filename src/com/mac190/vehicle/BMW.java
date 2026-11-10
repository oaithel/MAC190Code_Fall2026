package com.mac190.vehicle;
import com.mac190.vehicle.State;

import java.util.Objects;

/*
Design a class BMW, that is a Vehicle, in addition it has the following:
FuelType is gas
Make is "BMW"
Model (example "X6")
It has a Color and number of seats as well.

Implement the methods as follows:
turnLeft, just display turning left the degree amount
same for turn right
Brake implement it so that if the car is not in stop mode, put it in stop mode
moveForward implement it so that the car moves forward (initial speed 10m/h)
only if it was in stopping state already
Same for moveBackwards
implement speedUp to increase the speed by the input.
and display the speed, limit the speed to 100miles/hour
speedUp only increases the speed if it is movingForward.

Test your class.

 */
public class BMW extends Vehicle implements iDrive{
    private String model;
    private String color;
    private int numberSeats;
    private State state;

    public BMW(){

        super("N/A", "BMW", 'G');
        model = "N/A";
        color = "N/A";
        numberSeats = 0;
        state = State.STOPPED;
        speed = 0;
        /* You could do all the above in one call for
        the constructor bellow as follows:
        this("N/A", "N/A", "N/A", 0);
         */
    }
    public BMW(String v, String mod, String c, int s){
        super(v, "BMW", 'G');
        model = mod;
        color = c;
        numberSeats = s;
        speed = 0;
        state = State.STOPPED;
    }
    public State getState() {
        return state;
    }
    //no setter for the state, methods change the state.

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getNumberSeats() {
        return numberSeats;
    }
    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", numberSeats=" + numberSeats +
                ", state=" + state +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BMW bmw)) return false;
        if (!super.equals(o)) return false;
        return numberSeats == bmw.numberSeats && Objects.equals(model, bmw.model) && Objects.equals(color, bmw.color) && state == bmw.state;
    }

    @Override
    public void turnRight(double degrees) {
        System.out.println("Turning Right " + degrees + " degrees");
    }
    @Override
    public void turnLeft(double degrees) {
        System.out.println("Turning left " + degrees + " degrees");
    }
    @Override
    public void brake() {
        if(this.state != State.STOPPED){
            System.out.println("Stopping the car..");
            state = State.STOPPED;
            speed = 0;
        }else{
            System.out.println("Stopped already!");
        }
    }
    @Override
    public boolean speedUp(double sp) {
        if(state == State.FORWARD){
            this.speed = Math.min(this.speed + sp, 100);
            System.out.println("Moving forward at speed: " + speed + " m/h");
            return true;
        }
        System.out.println("Cannot speed up");
        return false;
    }
    @Override
    public boolean moveBackwards() {
        if(state == State.BACKWARD){
            System.out.println("Moving backwards already");
            return false;
        }else if(state == State.FORWARD){
            System.out.println("Cannot move backwards, moving forward, stop first");
            return false;
        }else{
            //move the car forward
            state = State.BACKWARD;
            speed = 10;
            System.out.println("Moving backwards at 10 m/h");
            return true;
        }
    }
    @Override
    public boolean moveForward() {
        if(state == State.FORWARD){
            System.out.println("Moving forward already");
            return false;
        }else if(state == State.BACKWARD){
            System.out.println("Cannot move forward, moving backwards, stop first");
            return false;
        }else{
            //move the car forward
            state = State.FORWARD;
            speed = 10;
            System.out.println("Moving forward at 10 m/h");
            return true;
        }
    }
}
