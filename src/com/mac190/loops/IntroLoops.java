package com.mac190.loops;
/*
There are mainly three different kind of loops:
while, for and d-while but all of them ultimately are translated
into a while loop by the compiler.

Initialization; //any instruction
outside the loop that affects the initial value of the condition
while(condition){
    Statements;
    Increment;
}

Increment is any instruction that may affect
the value of the condition

As long as the condition is true execute Statements.
If the condition is never faLSE, you get an infinite loop
If the condition is never true, the loop will never execute.

Example:

1. int total = 12;
2. int i = 3;
3. while(i <= 9){
4.    total = total - (i+2)/3
5.    i += 3;
6.}
System.out.println("Total:" + total);

1- What is the initialization? i = 3 only
2- What is the condsition? i <= 9
3- What is the increment? i += 3
4- Trace the loop (run the loop as if you were the computer)
    1. total = 12;
    2. i = 3
    3. while(3 <= 9) True
        4. total = 12 - (3 + 2)/3 = 12 - 1 = 11
        5. i = 3+3 = 6
    3. while(6 <= 9) True
        4. total = 11 - (6+2)/3 = 9
        5. i = 6+3 = 9
    3. while(9 <= 9) True
        4. total = 9 - (9+2)/3 = 6
        5. i = 9 + 3 = 12
    3. while(12 <= 9) False get out of the loop.
    print total = 6
 */
public class IntroLoops {
    public static void main(String[] args) {
        int total = 12;
        int i = 3;
        while(i <= 9){
               total = total - (i+2)/3;
               i += 3;
            System.out.println("total: " + total);
        }
        System.out.println("Total:" + total);

    }
}
