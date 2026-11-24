package com.mac190.exceptions;

public class ExceptionThrower {
    public void throwMeCheckedException(int a) throws Exception{
        if(a < 10){
            System.out.println("No exception is thrown");
        }else{
            throw new Exception("Input is larger or equal to 10");
        }
    }
    public void throwMeUncheckedException(int a){
        if(a > 20){
            throw new RuntimeException("a is larger than 20 big problem!!!");
        }else{
            System.out.println("No unchecked exception is thrown");
        }
    }
}
