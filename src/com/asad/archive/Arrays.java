package com.asad.archive;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        //You have to store a roll number....
        int a = 85;

        // storing a prson name
        String name = "Asad";


//        Store 5 roll nos ?/
        int [] rnos = new int[5];
        //or direct way
        int[] rnos2 = {7,8,45,85,99};
//        ting ting ting

        //dynamic memory allocation
        //internally how it works?
        //arr is in stack
        //arr will be pointing towards the heap which stores the object

        String arr[]= new String[5];
        System.out.println(rnos[0]);
        System.out.println(arr[0]);

        //by default it has 0 in int array and null as value in string array.
        /*
        Why does it has null as the value? Lets dive into it
        internally what happens is
            Primitives like int,bool,char are stored in stack memory
            but all other objects/classes in java are stored in heap memory

            Each particular element in String array is an object.

         */


    }
}
