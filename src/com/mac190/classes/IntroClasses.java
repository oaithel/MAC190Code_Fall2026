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
        ExampleClass obj2 = new ExampleClass();
        //increment it one time
        obj2.increment();
        //print its value
        obj2.print();
        //assign Obj1 to obj2
        obj2 = obj1; //obj2 is referring to the same object as obj1
        //print both objects. What happened?
        obj1.print();
        obj2.print();
        //increment obj1 twice
        obj1.increment();
        obj1.increment();
        //display both. Why did you get that result???
        //both obj1 and obj2 refer to the same object (the first object)
        //the second object to which obj2 used to refer to will be destroyed after
        //going out of scope because no reference to it.
        obj1.print();
        obj2.print();
        //change num of obj1 to 10. To change an attribute of an object. we use
        //objectName.variableName = value; if we have right of access.
        obj2.num = 10; //can be done because num is public
        obj1.print();
    }
}
