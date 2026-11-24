package com.mac190.files;

/*
Use notepad to create a txt file (data.txt) put the following data in it.
23334  john  theSecond  12.3
3445   moe   lastName   14.5
234235 alice jason      15.6

Write a Java program that opens the file data.txt and creates
a new file data_out.txt from the previous file in the following form
 F:john  L:theSecond  S:23334 T:12.3
 F:moe   L:lastName   S:3445  T:14.5
 F:alice L:jason      S:234235 T:15.6

 //my input file is in "C:/Users/momo/LAGCC/courses/Mac190/Fall2026/MAC190Code_Fall2026/data.txt"
 The output file should be data_out.txt
 */

import java.io.*;
import java.util.Scanner;

public class PracticeFiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input file: ");
        String inFileName = sc.nextLine();
        //create a file object for the input file and verify it exists.
        File inFile = new File(inFileName);
        if(!inFile.exists()){
            System.out.println(inFileName + ": file does not exist");
            System.exit(1);
        }
        //create an output file. First name for the output file
        int indexDot = inFileName.indexOf('.');
        String outFileName = inFileName.substring(0, indexDot); //without the dot
        outFileName += "_out.txt";

        try{
            FileWriter fw = new FileWriter(outFileName);
            BufferedWriter bw = new BufferedWriter(fw);
            FileReader fr = new FileReader(inFileName);
            Scanner scFile = new Scanner(fr);
            while(scFile.hasNextLine()){
                int ssn = scFile.nextInt();
                String fname = scFile.next();
                String lname = scFile.next();
                double time = scFile.nextDouble();
                //F:alice L:jason      S:234235 T:15.6
                String line = "F:" + fname + "\tL:" + lname +"\tS:" + ssn + "\tT:"+time +"\n";
                bw.write(line);
            }
            scFile.close();
            bw.close();
        }catch (IOException e){
            System.out.println("Caught IOException: " + e.getMessage());
        }

    }

}
