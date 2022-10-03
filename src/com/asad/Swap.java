package com.asad;

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
    }

}

