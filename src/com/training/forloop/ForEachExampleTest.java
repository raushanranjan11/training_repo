package com.training.forloop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachExampleTest {
/*
  for-each loop is used to traverse array or collection in Java
  for(data_type variable : array_name){
        //code to be executed
    }
    */

    public static void main(String[] args) {

      /*  int arr[] = {12, 23, 44, 56, 78};
        //Printing array using for-each loop
        for (int i : arr) {
            System.out.println(i);
        }
*/
        List<String>  list = new ArrayList<String> ();
        list.add("Rohan");
        list.add("RAhul");

        /*Iterator it  = list.iterator();
        while(it.hasNext()){
           String name =  (String)it.next();
            System.out.println(name.toUpperCase());
        }*/

        for (String st :list) {
            System.out.println(st.toUpperCase());
        }

    }
}
