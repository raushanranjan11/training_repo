package com.training.ioPackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Example1 {
    {
        System.out.println("instance");
    }

    static List<Student> listOfStudent = new ArrayList();

    static {
// System.out.println("static");
        listOfStudent = new ArrayList();
        listOfStudent.add(new Student("Raj", 20, "Third",
                7, new StudentAddress("Naamkum", "Naamkum",
                "Naamkum", "Ranchi", 10000L)));
        listOfStudent.add(new Student("Rohan", 25, "Third",
                4, new StudentAddress("Hehal", "pandra",
                "pandra", "Ranchi", 10000L)));

    }

    int aa;


    String name = "Rahul";

    public static void main(String[] args) throws IOException {
        Example1 example1 = new Example1();
// int b = 5;
// System.out.println(increment(b));
////// System.out.println(example1.increment(b));
//// System.out.println(b);
// System.out.println("Hello");
// example1.main();

        for (Student st : listOfStudent) {
            System.out.println(st);
        }

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        List<Student> changedStudent = example1.ChangeNameOfStudent();
        for (Student st : changedStudent) {
            System.out.println(st);
        }
    }


    public List<Student> ChangeNameOfStudent( ) {
        List<Student> changedStudent = new ArrayList();
        System.out.println("Hello");
        for (Student st : listOfStudent) {
            if(st.getRollNumber()==4)
                st.setMarks(45);
            else
                st.setMarks(95);
            changedStudent.add(st);
        }


        return changedStudent;
    }

    public static int increment(int a) {
        return a + 1;
    }
}