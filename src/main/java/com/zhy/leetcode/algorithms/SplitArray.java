package com.zhy.leetcode.algorithms;

import java.util.Arrays;

public class SplitArray {

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,6,7,8,9};
        int min = splitArr(arr);
        System.out.println(min);
    }

    private static int splitArr(int[] arr) {

        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0;i< arr.length;i = i+2){
            sum = sum + arr[i];
        }

        return sum;
    }


}
