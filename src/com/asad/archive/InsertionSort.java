package com.asad.archive;
import java.util.Scanner;

import java.util.ArrayList;

public class InsertionSort {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = in.nextInt();
        int arr[] = new int[size+1];
        System.out.println("Enter the values ");
        for (int i=1;i<=size;i++){
            arr[i] = in.nextInt();
        }
        for (int j=2;j<=size;j++){
            insert(arr, arr[j], j-1);
        }
        System.out.println("Array after sorting : ");
        for (int i=1;i<=size;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void insert(int[] arr,int elt, int i){
        arr[0] = elt;
        while (elt<arr[i]){
            arr[i+1] = arr[i];
            i--;
        }
        arr[i+1] = elt;
    }


    public static void main(String[] args) {
        int[] arr = { 2,-32,0,89,1};
        selection(arr);
        int [] ans = selection(arr);
        System.out.println(ans);
    }

    static void selection(int [] arr) {
        for (int i = 0;i <arr.length;i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);

        }
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;

        for (int i = start; i <= end; i ++){
                if (arr[max] < arr[i]){
                    max = i;
                }
        }

        return max;
    }

    static void swap(int []arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }



}
