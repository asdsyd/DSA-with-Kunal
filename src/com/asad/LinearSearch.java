package com.asad;

public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = {12,34,56,78,98,-4,4,8};
        int target = 8;
        int ans = linearSearch(nums,target);
        System.out.println(ans);

    }

    //Search in the array : return the index if found else -1

    static int linearSearch(int[] arr , int target){
        if (arr.length == 0){
            return -1;
        }
        //run a for loop
        for (int index=0;index<arr.length; index++){
            //checking if element at every index is = target
            int element = arr[index];
            if(element== target){
                return index;
            }
        }
        //this will execute only if none of return statements above works
        //which implies that the target is not found
        return -1;
    }

}
