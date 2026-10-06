package com.mac190.classes;
/*
In nature everything is an object. Your car is an object that has specific
attributes: power, number of doors, speed, color, ....
Mine is another car object with different attributes.
Both objects are instances of a Car. A Car class would be the blue print
of those object, a description of those objects in terms of data (attributes)
and behavior: actions you can perform on the objects, for instance
in our case, actions would be: start, moveforward, turnleft, brake, ...
In a class actions are implemented by methods, simular to functions, but they
act on the object itself only. Every object has its own data (attributes)
and its own methods that act on it or on its attributes.
To define a class, we use the following:
public class ClassName{
    //member variables
    access_specifier1 type1 variableName1;
    access_specifier1 type1 variableName1;

    //methods
    access_specifier  typeM1 methodName1(type1 param1, .....){

    }
}
access specifier are:
private: can be accessed only by the class itself and nothing else
public: can be accessed by anyone
protected: can be accessed by the class itself and the derived classes.
default (if no access is specified): public inside the package
and private outside
//Let create a simple class called ExampleClass that has one integer
member variable num and two methods: one method that increments the variable
an done method that displays the value of the variable

 */
public class IntroClasses {
    public static void main(String[] args) {
        //create an object ExampleClass obj1.
        //To create an object of a class ClassName:
        //ClassName objectName = new ClassName();
        //objectName is an instance of ClassName
        ExampleClass obj1 = new ExampleClass();
        //display it
        //to invoke a method on an object we use
        //objectName.methodName(....)
        obj1.print();
        //increment it three times
        obj1.increment();
        obj1.increment();
        obj1.increment();
        //print its value
        obj1.print();

        //create an object ExampleClass obj2.

        //increment it one time

        //print its value

        //assign Obj1 to obj2

        //print both objects. What happened?

        //increment obj1 twice

        //display both. Why did you get that result???
    }
}
