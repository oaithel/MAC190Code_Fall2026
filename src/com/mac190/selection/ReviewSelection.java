package com.mac190.selection;
/*
Very often you reach a point in your program where the flow (logic) of
the program needs to follow different directions.A decision has to be made
which path to follow, for that we use selection statements:
if-else or switch statement.
if(condition){
    StatementsA;
}else{
    StatementsB;
}
StatementsA and B can be any code including if-else etc...
condition in the if evaluates to true or false. true and false
in Java are distinct values (in C++ only 0 is false, anything else
is true).
In C++ the following is allowed
int var = 2;
if(var) {
}

In java it is not allowed.
Comparators that are mostly used: < smaller > larger
<= smaller or equal
>= larger or equal
== is it equal
!= is it not equal
!(negation, it negates anything it preceeds).
to what the following condition evaluate?
int var1 = 2, var2 = 4, var3 = 6;
1- if(var1 < 2 || var2 > 2)
         F     ||    T  =  True
2- if(var1 == 2 || var3) Error
3- if(var1 <= 2 || var2 < 4 && var3 < 4)
           T    ||      F   &&   F
           T    ||          F  = T
4- if(var1 <= 2 && var2 < 4 || var3 < 4)
           T     &&    F   ||   F
                  F   ||  F  = F


 */
public class ReviewSelection {
    public static void main(String[] args) {
        //implement the statements above and display if each is true
        //or false. Verify them,.
    }

}
