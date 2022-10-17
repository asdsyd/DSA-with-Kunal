package com.asad;

public class FloorProblem {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 23;
        int ans = Floor(arr,target);
        System.out.println(ans);

    }
    //return the index
    // return -1 if not found

    //return the index of largest no <= target
    static int Floor(int[] arr,int target){

        //but what if target is greater than the greatest no in array?
        if (target> arr[arr.length - 1]){
            return -1;
        }

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
        return end;

    }
}
