package com.mac190.files;
/*
A file is a secondary memory to store data, usually it resides in the hard drive.
Files are organized in directories. A directory is not a file.
The file can be text or binary. Text files are files that you can
view using any editor. Binary files are files likwe image, video,
executable, require special software to view/play/excute ...
Output files are files to store data in. Input files are files
used to retrieve data. (A file can be both input and output).
The location of a file: is called a path
C:/Users/Instructor/MAC190/example.txt
The file name is example.txt and it is located in the diretory MAC190
which is in the directory Instructor which is in Users which happens to
be in the C drive.
"C:/Users/Instructor/MAC190/example.txt" This is an obsolute path
because it specifies the hard drive and all the path.
"../../MAC190/example.txt" This is a relative path tot he current
directory. This means go back two directories, then go into directory MAC190
to find the file example.txt
"./example.txt" this means example.txt is in the current directory
 In java the object File is used to manage files and directories, but
 not to read/write a file. You can use it to rename a file, to delete
 a file to move a file ...
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFiles {
    public static void main(String[] args) {
        String directoryName = "C:/Users/B306_INSTRUCTOR/IdeaProjects/MAC190Code_Fall2026";
        File myFile = new File(directoryName);
        if(!myFile.exists()){
            System.out.println(directoryName + " does not exist!!");
            return;
        }
        System.out.println(directoryName + " exists!!");
        System.out.println("is " + directoryName + "a directory? " + myFile.isDirectory());
        System.out.println("is " + directoryName + "a file? " + myFile.isFile());
        File myRealFile = new File("C:/Users/B306_INSTRUCTOR/IdeaProjects/MAC190Code_Fall2026/example.txt");
        //The following directory will trigger an exception in B306
        // File myRealFile = new File("C:/example.txt");

        if(!myRealFile.exists()){
            //it does not exist, I will create it
            //create a new file trows a checked exception, therefore
            //you must use a try-catch block
            try {
                myRealFile.createNewFile();
            }catch(IOException e){
                System.out.println("Got an exception: " + e.getMessage());
            }
        }
        //we have the file
        //let's write few line to the file.
        //first create a FileWriter object, then create a BufferedWriter
        //using the FileWriter object, then you can write strings to the file
        try {
            FileWriter fw = new FileWriter(myRealFile);
            //OR
            //FileWriter fw = new FileWriter("C:/Users/B306_INSTRUCTOR/IdeaProjects/MAC190Code_Fall2026/example.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            //now you can write to the file
            bw.write("This is the first line\n");
            bw.write("This is the second line\n");
            bw.write("This is the third line.");
            bw.close();

            /*
            Modify the program so that it reads lines of text from the user
            and puts them in the file. The users stops the input by writing one
            dot on an empty line.
            Please enter your text:
            sdfasdfsdf sdfisdi  awdohwdh
                weildughsd oijasdahsdd
                awiudgh aiwdh   awd
                .
            The text is saved to the file.
             */

        }catch (IOException e){
            System.out.println("Caught an exception: " +e.getMessage());
        }
    }
}
