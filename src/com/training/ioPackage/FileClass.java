package com.training.ioPackage;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileClass {

// FileOutputStream;
// Stream

// Using FileOutputStream() constructor
// Using File.createNewFile() method ------------------------------------->
// Using Files.write() method
    // File,Filewriter,filereader,BufferedReader,BufferedWriter printwriter

// Character

    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");//1
        System.out.println(file.exists());
        file.createNewFile();
        System.out.println(file.exists());

        File file2 = new File("abc.pdf");//1
        System.out.println(file2.exists());
        file2.createNewFile();
        System.out.println(file2.exists());
        File file3 = new File("abc.doc");//1
        System.out.println(file3.exists());
        file3.createNewFile();
        System.out.println(file3.exists());


        //******************************************************************
        File file1 = new File("song");//2
        System.out.println(file1.exists());
        file1.mkdir();
        System.out.println(file1.exists());


 /* Files.write(Paths.get("def.txt"), "Test".getBytes());
 for (byte b : "Test".getBytes()) {
 System.out.println(b);
 }*/



        FileWriter writer = new FileWriter(file);
// writer.write("Saumya is nice guys");
// writer.close();

// FileReader fileReader = new FileReader(file);
// System.out.println(fileReader.read());



 /*Reads a single character.
 Returns:
 The character read, or -1 if the end of the stream has been reached
 Throws:
 IOException – If an I/ O error occurs*/

        // read content

        FileReader reader = new FileReader(file);
        int c;
        while ((c = reader.read()) != -1) {
            char ch = (char) c;
            System.out.print(ch);
        }
        for (byte b : "Saumya is nice guy".getBytes()) {
            System.out.println(b + " "+ (char)b);
        }
    }




// // Student --- name,rollNumber,batch,marks ,Addreess
//
//// Addreess village/city,post
// // Add list - 5,
// // Uppercase
// Address null// custome exception "message"
}