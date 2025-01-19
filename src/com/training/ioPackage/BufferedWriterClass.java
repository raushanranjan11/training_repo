package com.training.ioPackage;

import java.io.*;

public class BufferedWriterClass {

    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("test1.txt");
             FileReader fr = new FileReader("test1.txt")) {
//        FileWriter writer = new FileWriter("test1.txt");
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write("Welcome to Training room.");
            System.out.println("Success");


            BufferedReader br = new BufferedReader(fr);
            int i;
            while ((i = br.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*FileReader fr=new FileReader("test1.txt");
        BufferedReader br=new BufferedReader(fr);

        int i;
        while((i=br.read())!=-1){
            System.out.print((char)i);
        }
        br.close();
        fr.close();*/


    }



}