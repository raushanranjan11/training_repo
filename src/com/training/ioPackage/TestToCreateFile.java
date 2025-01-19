package com.training.ioPackage;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestToCreateFile {


    public static void main(String[] args) {
        List<Student> listOfStudent = new ArrayList();
        listOfStudent.add(new Student("Raj", 20, "Third",
                7, new StudentAddress("Naamkum", "Naamkum",
                "Naamkum", "Ranchi", 10000L)));
        listOfStudent.add(new Student("Rohan", 25, "Third",
                4, new StudentAddress("Hehal", "pandra",
                "pandra", "Ranchi", 10000L)));/*
 try{

 } catch (Exception e) {
 throw new RuntimeException(e);
 }*/

        try (FileOutputStream os = new FileOutputStream("student.txt")) {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(os);
            bufferedOutputStream.write("Roll ".getBytes());
            bufferedOutputStream.write("Name ".getBytes());
            bufferedOutputStream.write("Batch ".getBytes());
// bufferedOutputStream.flush();
            for (Student st : listOfStudent) {
                bufferedOutputStream.write(10);// new line
// bufferedOutputStream.write(st.getRollNumber());
                bufferedOutputStream.write(String.valueOf(st.getRollNumber()).getBytes());
                bufferedOutputStream.write(" ".concat(st.getName()).concat(" ").getBytes());// writes the bytes
                bufferedOutputStream.write(st.getBatch().getBytes());
                bufferedOutputStream.flush();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}


