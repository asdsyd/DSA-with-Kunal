package com.asad;
import java.util.Scanner;

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


}
