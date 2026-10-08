package com.mac190.even;

public class EvenTester {
    public static void main(String[] args) {
        //create an Even object E1
        Even E1 = new Even();//default constructor
        System.out.println("E1: " + E1);
        //assign to it 5
        E1.setEven(5);
        //display it using the toString method
        System.out.println("E1: " + E1.toString());
        //create another Even object E2
        Even E2 = new Even();//default constructor
        //assign to it whatever in E1 plus 7
        E2.setEven(E1.getEven() + 7);
        //display it.
        System.out.println("E2 = " + E2);
        // Create a third object with 13 right at the start
        Even E3 = new Even(13);
        System.out.println("E3: " + E3);
        if(E2.equals(E3)){ //E3 is E and E2 is this
            System.out.println("E2 is same as E3");
        }else{
            System.out.println("E2 is NOT same as E3");
        }
        //TODO: HW6
        //Create E4 as the sum of E1 and E2 using the add method
        //display it

        //Add 5 to E3 using the add method
        //display it

        //do the following in one instruction
        //E1 = E2+9+E1
        //display it.
    }
}
