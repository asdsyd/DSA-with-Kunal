package com.asad.archive;
import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i =0;i < arr.length; i++){
            arr[i] = in.nextInt();
        }

//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        for (int num : arr){
            System.out.print(num + " ");
        }
        //Alrighty ;)


    }

}
