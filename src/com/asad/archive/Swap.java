package com.asad.archive;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;


        //This is how we are used to swapping concept
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a,b);

        System.out.println(a + " " + b);

        String name = "Asad SAyeed";
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String name) {
        name = "Kunal Kushwaha";
    }

    static void swap(int a , int b){
        int temp = a ;
        a = b;
        b = temp;
        //scoping in for loops
        for (int i = 0;i<4;i++){
            System.out.println(i);
            int num =10;
            a = 1111;

        }
        int i= 12;
        //initialised outside the block after being intialised inside the block :)

    }
    //Concept of Shadowing aww
    //smaller block scope cannot shadow extending block ;p

    //VarArgs
    //int ...v (internally taking as an array of arguments)




}

