package com.asad.archive;

public class CeilingProblem {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = Ceiling(arr,target);
        System.out.println(ans);

    }
    //return the index
    // return -1 if not found

    //return the index of smallest no >= target
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
