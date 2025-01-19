package com.training.ioPackage;

import java.io.*;

public class OutputStreamClass {




    public static void main(String[] args) throws IOException {
//4.//        OutputStream os1 = new FileOutputStream("test1.txt");

        try {
            byte byteArray[] = {65, 66, 67, 68, 69} ;// ASCII
            String data = "This is a Java training text inside the file";
            OutputStream os = new FileOutputStream("test.txt");
           /* for (int x = 0; x < byteArray.length; x++) {
                os.write(10);
                os.write(byteArray[x]);   // writes the bytes
            }*/
            byte[] array = data.getBytes();
            os.write(array);
            os.close();
        } catch (
                IOException ex) {
            System.out.println(ex.getMessage());
        }
//------------------------------------------------------------------------------
        InputStream input = new FileInputStream("test.txt");
        int size = input.available();
//ABCD
       /* for(int i = 0; i < size; i++) {
            System.out.print((char)input.read() + "  ");
        }
        input.close();*/
        System.out.println("Available bytes at the beginning: " + input.available());

        if(input.available()>0) {
            input.skip(5);
            int i = input.read();
            while (i != -1) {
                System.out.print((char) i);
                i = input.read();
            }
        }
        input.close();
    }
}