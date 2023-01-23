package com.asad.archive;

public class LinearSearchProblems {
    public static void main(String[] args) {

        int[] nums = {1,3,5,6};
        int ans = searchInsert(new int[]{1, 3, 5, 6},5);
        System.out.println(ans);
    }
    public static int searchInsert(int[] nums, int target){
        int output =0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i]==target){
                output= i;
                break;

            }
            if (nums[i]<target){
                output = i+1;

            }
        }
        return (output);
    }



}
