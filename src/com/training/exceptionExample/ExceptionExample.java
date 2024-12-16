package com.training.exceptionExample;

import java.io.*;
import java.sql.SQLException;
import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) throws IOException {
       try {
//            sum();

        } catch (ArithmeticException ex) {
            System.out.println("Some thing happen during addition");
            ex.printStackTrace();

        } catch (Exception ex) {
            System.out.println("SQL Exception during addition");
        }finally {
            System.out.println("finally---------------");
        }

       /* System.out.println("My Name");
        System.out.println("My Name1");
//        System.out.println(1/0);
        System.out.println("My Name2");
        System.out.println("My Name3");*/

       /* File file  = new File("C:\\Users\\Raushan Ranjan\\OneDrive\\Desktop\\temp\\test.txt");
        file.createNewFile();
        System.out.println(file.getAbsolutePath());*/


       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String name=scanner.nextLine();
        File testFile  = new File("C:\\Users\\Raushan Ranjan\\OneDrive\\Desktop\\Java-lecture\\temp\\doc.text");
        testFile.mkdirs();
       *//* if(testFile.createNewFile()){

        }*//*

        FileOutputStream fos=new FileOutputStream(name, true);  // true for append mode
        System.out.print("Enter file content: ");
        String str=scanner.nextLine()+"\n";      //str stores the string which we have entered
        byte[] b= str.getBytes();       //converts string into bytes
        fos.write(b);           //writes bytes into file
//        fos.close();            //close the file
        System.out.println("file saved.");
*/
//        String  name = null ;
//        System.out.println(name.toUpperCase());

 /*FileReader reader = new FileReader("doc");
try {
    reader = new FileReader("doc");
    System.out.println(reader.read());

}catch (FileNotFoundException ex){

} catch (IOException e) {
//    throw new RuntimeException(e);
}finally{
    reader.close();
}

try{

}catch(Exception ex){}*/


        try (Scanner scanner = new Scanner(new File("abc.txt"))) {
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException | ArithmeticException ex) {
            System.out.println(ex.getMessage());

        }

    }

    /*public static int sum() throws SQLException {

        throw new ArithmeticException("arith--------");
//        return 5;
    }*/
}
