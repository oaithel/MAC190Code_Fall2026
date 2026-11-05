package com.mac190.vehicle;
import com.mac190.vehicle.State;

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
moveForward implement it so that the car moves forward (initial speed 10m/h) only if it was in stopping state already
Same for moveBackwards
implement speedUp to increase the speed by the input.
and display the speed, limit the speed to 100miles/hour
speedUp only increases the speed if it is movingForward.

Test your class.

 */
public class BMW {
    private State state;

    public BMW(){
        state = State.STOPPED;
    }
}
