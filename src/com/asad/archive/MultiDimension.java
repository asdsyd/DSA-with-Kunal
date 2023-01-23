package com.asad.archive;

import java.util.Scanner;


public class MultiDimension {

    public static void main(String[] args) {
        /*


            123
            456
            789


            This is a 2d array



         */
//        int[][] arr = new int[3][3];

//
//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//
//        System.out.print(arr);

        Scanner in = new Scanner(System.in);
        //Input and output array
        int[][] arr = new int[3][3];
        System.out.println(arr.length); //prints no of rows

        //input is being taken

        for(int row=0;row < arr.length; row++){
            for (int col=0;col< arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }

        for(int row=0;row < arr.length; row++){
            for (int col=0;col< arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }



    }
}
