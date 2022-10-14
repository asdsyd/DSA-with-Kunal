package com.asad;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // Order Agnostic BS is actually working, initial input array was not sorted properly
        int[] arr = {134,111,100,99,98,91,83,77,44,22};
        int target = 99;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //finding whether array is ascending or descending
        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2 ; here it might be possible that it might exceed the range of integer if value is very big
            //so we do this( better way to find mid
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }

            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }


        }return -1;
    }
}


