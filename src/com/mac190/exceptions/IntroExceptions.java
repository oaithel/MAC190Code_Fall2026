package com.mac190.exceptions;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

/*
An exception is a mean to control errors in programming. As its name suggests
they are to deal with exceptional circumstances.
There are two kinds of exceptions: Unchecked exceptions which are usually runtime exceptions
and the program needs to close whenever they happen, you cannot recover from the error. Example
no memory, cpu fault, ...These exceptions do not need a try and catch block.
Checked exceptions are exceptions that require a try-catch (you can recover from the error)
trying to open a file with wrong path, you can change the path. User defined exception
are in general checked exceptions.
If you want to define your exception, you need to inherit from RuntimeException
if you want an unchecked exception OR Exception if you want a checked exception.
 */
public class IntroExceptions {
    public static void main(String[] args) {
        //create an object ExceptionThrower
        ExceptionThrower ET = new ExceptionThrower();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an int: ");
        int num = sc.nextInt();
        try {
            ET.throwMeCheckedException(num);
            System.out.println("Successful call");
        }catch(Exception e){
            //e.printStackTrace();
            System.out.println("Caught Exception: " + e.getMessage());

        }finally {
            //this will always be executed, no matter if the exception is triggered or not
            System.out.println("This will always be displayed!!");
        }
        ////call throwMeUnchecked
        ET.throwMeUncheckedException(num);
        System.out.println("Calling unchecked success");

    }
}
