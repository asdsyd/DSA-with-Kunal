package com.asad.archive;

public class SmalltestGreater {
    static int Ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            //find the middle element
            //int mid = (start + end) / 2 ; here it might be possible that it might exceed the range of integer if value is very big
            //so we do this( better way to find mid
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return start;

    }
}
