package com.asad;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax for arraylist
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);

//        list.add(8);
//        list.add(9);
//        list.add(99);
//        list.add(8);
//        list.add(9);
//        list.add(99);
//        list.add(8);
//        list.add(9);
//        list.add(99);
//        list.add(8);
//        list.add(9);
//        list.add(99);
//        list.add(8);
//        list.add(9);
//        list.add(99);
//        list.add(8);
//        list.add(9);
//        list.add(99);
//        list.add(8);
//        list.add(9);
//        list.add(99);
//        list.add(8);
//        list.add(9);
//        list.add(99);
//        list.add(8);
//        list.add(9);
//        list.add(99);
//        list.add(8);
//        list.add(9);
//        list.add(99);
//        list.add(8);
//        list.add(9);
//        list.add(99);
//        list.add(8);
//        list.add(9);
//        list.add(99);
//
//        System.out.println(list.contains(888));
//        list.set(0,22);
//        list.remove(0);

        for (int i=0;i<5;i++){
            list.add(in.nextInt());
        }

        for (int i=0;i<5;i++){
            System.out.println(list.get(i));
        }


        System.out.println(list);
    }

}
