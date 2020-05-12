package com.zhy.leetcode.algorithms;


import java.util.HashMap;

/**
 * 求两个数之和
 */

public class TwoNum {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7};
        int[] newArr = twoSumByHash2(arr,10);
        for (int i = 0; i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }

    public static int[] twoSum(int[] nums,int target){

        for(int i=0 ; i < nums.length ; i++){
            for (int j = i+1 ; j < nums.length ; j++){
                if(nums[j] == target-nums[i]){
                    return new int[]{i,j};
                }
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSumByHash(int[] nums ,int target){
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i = 0;i<nums.length;i++){
            hashMap.put(nums[i],i);
        }
        for (int i = 0;i<nums.length;i++){
            int complement = target-nums[i];
            if(hashMap.containsKey(complement) && complement != nums[i]){
                return new int[]{i,hashMap.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSumByHash2(int[] nums,int target){
        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i = 0;i<nums.length;i++){
            int complement = target - nums[i];
            if(hashMap.containsKey(complement)){
                return new int[]{i,hashMap.get(complement)};
            }
            hashMap.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
