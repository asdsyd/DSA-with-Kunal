package com.asad;

import java.util.Scanner;

 public class BubblingSort {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the size : ");
            int size = in.nextInt();
            int theArray[] = new int[size];
            System.out.println("Enter the values ");
            for (int i=0;i<size;i++){
                theArray[i] = in.nextInt();
            }
            for (int j=0;j<size-1;j++){ 
                for(int k=0;k<size-j-1;k++){
                    if(theArray[k+1] < theArray[k]){
                        int temp = theArray[k+1];
                        theArray[k+1] = theArray[k];
                        theArray[k] = temp;
                    }
                }
            }
            for (int z=0;z<size;z++){
                System.out.print(theArray[z] + " ");
            }

        }


    }

