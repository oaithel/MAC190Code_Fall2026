package com.mac190.vehicle;

import java.util.Objects;

/*
Design a class Tesla, that is a Vehicle, in addition it has the following:
FuelType is electric
Make is "Tesla"
Model of the car
It has a Color and number of seats as well.

Implement the methods as follows:
turnLeft, just display turning left the degree amount
same for turn right
Brake implement it so that the car is put in stop mode
moveForward implement it so that the car moves forward only if it was in
stopped state already
Same for moveBackwards
implement speedUp to increase the speed by no more than 10miles/hour
or the input (if the input is less than 10 m/h) and display the speed, limit the speed to 80miles/hour
speedUp only increases if it is movingForward.

Test your class.

*/
public class Tesla extends Vehicle implements iDrive{
    private String model;
    private String color;
    private int numberSeats;
    private State state;

    public Tesla(){
        super("N/A", "Tesla", 'E');
        model = "N/A";
        color = "N/A";
        numberSeats = 0;
        state = State.STOPPED;

        /* You could do all the above in one call for
        the constructor bellow as follows:
        this("N/A", "N/A", "N/A", 0);
         */
    }
    public Tesla(String v, String mod, String c, int s){
        super(v, "Tesla", 'E');
        model = mod;
        color = c;
        numberSeats = s;
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
        return "Tesla{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", numberSeats=" + numberSeats +
                ", state=" + state +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tesla tes)) return false;
        if (!super.equals(o)) return false;
        return numberSeats == tes.numberSeats && Objects.equals(model, tes.model) && Objects.equals(color, tes.color) && state == tes.state;
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
            sp = Math.min(sp, 10);//limit the increase to 10m/h
            this.speed = Math.min(this.speed + sp, 80); //limit the speed to 80m/h
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
