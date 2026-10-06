package com.mac190.stars;

import java.util.Scanner;

/*
Write a program that accepts the number of lines of stars to display
and displays them as follows:
Example: input = 5
*****
****
***
**
*
for(int i = 0; i < N; i++) this loop loops N times
Have a loop that goes through the lines to display. i loop.
Have a j loop for the number of stars to display for every i
lines = 5
i (line number)   j (number of stars to display)
0                 5
1                 4
2                 3
3                 2
4                 1

What is the relationship betweek i and j? i + J = 5 (lines)
j = lines - i
your i loop loops lines number of times
your j loop inside the i loop loops lines - i times.


Shape 2:
*
**
***
****
*****
i        j
0        1
1        2
2        3
3        4
4        5

j = i + 1

 */
public class Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int lines = sc.nextInt();
        System.out.println("-----------Shape1--------");
        for(int i =0; i < lines; i++){
            for(int j = 0; j < lines - i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" -----------Shape2----------");
        for(int i =0; i < lines; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //TODO: HW4
        /*
        Shape 3
            *
           **
          ***
         ****
        *****

        k loop sfor displaying spaces and j loop for stars
        i      k loop       j
        0       4           1
        1       3           2
        2       2           3
        3       1           4
        4       0           5
        k = Lines - i - 1
        j = i + 1
         */
        System.out.println("--------------Shape 3-----------");

        for(int i = 0; i < lines; i++){
            //display spaces first
            for(int k = 0; k < lines-i-1; k++){
                System.out.print(" ");
            }
            //display the stars
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        /*
        Do the same for Shape4
        *****
         ****
          ***
           **
            *
         i      k (spaces)      j (stars)
         0      0               5
         1      1               4
         2      2               3
         3      3               2
         4      4               1
         k = i
         j = lines - i
         */
        System.out.println("--------------Shape 4-----------");

        for(int i = 0; i < lines; i++){
            //display spaces first
            for(int k = 0; k < i; k++){
                System.out.print(" ");
            }
            //display the stars
            for(int j = 0; j < lines-i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
