package com.mac190.variables;
/*
What is a variable: A variable is a memory space where data is saved.
Every variable is associated with a name or ID that is tied to its location
in the memory.
You can use any name as long as it does NOT:
1- start with a digit
2- Does not contain a special character, the most annoying special
character is space. Once there is a space, you have two words not one.
`~!@#$%^&*()+-=}{[]|\:";'?/.>,<
_ is allowed.
3- Should not be a keyword: if else while for private ....

Variables in Java have to be defined before used. To define a variable
you need to specify its type and its name only once.
types are: int, float, long, double, char, short, byte, boolean
Why do we need to specify a type? for two reasons: 1- for the compiler to
know the amount of space to allocate for the variable.
2- Because different types are not saved the same way and not used the same
way.

When defining variables, use speaking names so that the name says
what the variables is used for. First name all lower case subsequent
names first letter capital.
A variable for the number of students in the class, I would
write it as follows: numberOfStudentInClass

 */
public class Variables {
    public static void main(String[] args) {
        //define a variable to contain the number of students in the class
        int numberStudents = 19;
        //there are 19 display it
        System.out.println("There are " + numberStudents + " students in the class");
        //add 3 to it.
        numberStudents += 3;
        System.out.println("Now, there are " + numberStudents + " students in the class");
        //define a variable to contain the changes in your pocket
        //you have 14 dollars and 57 cents. display it
        float changeInPocket = 14.57f;
        System.out.println("There are $" + changeInPocket + " in my pocket");
        //subtract 12 cents less than half of it. display it
        changeInPocket -= changeInPocket/2 - 0.12f;
        System.out.println("There are $" + changeInPocket + " left in my pocket");
        //find the exact number of dollars left in a variables dollarsLeft
        //display it.
        int dollarsLeft = (int) changeInPocket;
        System.out.println("There are $" + dollarsLeft + " dollars left");
        //define a variable to contain the answer y for yes and n for no;
        //the answer is yes. Display it in capital form.
        char answer = 'y';
        System.out.println("Your answer is: " + Character.toUpperCase(answer));
    }
}
