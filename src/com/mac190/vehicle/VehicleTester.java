package com.mac190.vehicle;

public class VehicleTester {
    public static void main(String[] args) {
        //create a BMW
        //display it
        BMW yourBM = new BMW("SDFSDF131313", "X6", "Blue", 4);
        System.out.println("YourBM: " + yourBM);
        yourBM.moveForward();
        yourBM.speedUp(60);
        yourBM.moveBackwards();
        yourBM.brake();
        yourBM.moveBackwards();
        yourBM.turnRight(30);
        //Use the interface iDrive
        System.out.println("----Using the interface---");
        iDrive ifBM = yourBM;
        ifBM.moveForward();
        //You canuse all methods defined in idrive interface only.
        //yourBM.getColor(); //you cannot use getColor() because it's not defined in the interface.

        //create a Tesla object
        //display it
        Tesla T = new Tesla("SDFSDF13112313", "X", "Blue", 4);
        System.out.println("Tesla: " + T);
        T.moveForward();
        T.speedUp(60);
        T.moveBackwards();
        T.brake();
        T.moveBackwards();
        T.turnRight(30);
        //use a reference Vehicle V to drive the BMW. Increase the speed ...
        Vehicle V = (Vehicle) yourBM;
        V.moveBackwards();
        System.out.println("The speed is: " + V.getSpeed());
        //Move the referrence V from the BMW to the Tesla, drive it. Try
        //methods that should display error
        V = (Vehicle) T;
        V.moveBackwards();
        V.brake();
        System.out.println("make is: " + V.getMake());
        //Add any testing you deem necessary

        //I can use the same interface ifBM to drive a tesla.
        System.out.println("----using interface to drive a tesla----");
        ifBM = T;
        ifBM.moveForward();
        ifBM.turnLeft(20);
        ifBM.speedUp(30);
        ifBM.brake();

    }
}