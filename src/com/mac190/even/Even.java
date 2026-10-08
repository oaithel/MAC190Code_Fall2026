package com.mac190.even;
/*
Design and implement a class Even that has the following:
- One integer private member variable even that has to be even at all times.
- getter for even
- setter for even: if the input is odd then even is set to the next even number
(input 3, then even is set to 4)
- Override the toString() method to return even in the form of a sting
 ("even=  4")
 public String toString(){
    //create a string with word even and its value
    //return it
 }

 */
public class Even {
    private int even;
    //A constructor is a public method with the same name as the class that allows
    //you to construct objects with initial attributes.
    //The constructor that does not accept any paramter is called default
    //constructor.
    //default constructor
    public Even(){
        even = 2;
    }
    public Even(int num){
        setEven(num);
    }
    //getter
    public int getEven(){
        return even;
    }
    //setter
    public void setEven(int num){
        if(num%2 == 0){
            even = num;
        }else{
            even = num+1;
        }
    }

    @Override
    public String toString(){
        //create an empty string
        String str = "";
        //add to it anything you want to return
        str += "even = " + even;
        //return it
        return str;
    }

    public boolean equals(Even E) {
        //Here we have two Even objects: this and E
        //this is the object on which a method is invoked.
        //When you cann a method you have to call it on an object like:
        // obj1.method(...)  this will refer to obj1
        if(this.even == E.even){
            return true;
        }
        return false;
    }
    //TODO: HW6
    //design a method that adds two Even objects to create a third
    //that is the sum of the two.
    public Even add(Even E){
        //how many objects are we going to have in this case?
        // We have this object, E the input and the third we will create
        //as the sum of this and E
        //create a third object. Set its even to the sum of even of this and
        //even of E.

        //return the created object.
    }
    //Same method but input is an integer: We call this overloading.
    //You can overload as long as the return type is the same and
    //the number or the type of the inputs is different
    //YOU CANNOT OVERLOAD BASED ONLY ON THE RETURN VALUE
    public Even add(int a){
        //how many objects are we going to have in this case?
        // We have this object, the one we will create
        //as the sum of this and integer a
        //create a third object. Set its even to the sum of even of this and
        //a.

        //return the created object.
    }
}
