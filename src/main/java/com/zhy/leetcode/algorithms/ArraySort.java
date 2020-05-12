package com.zhy.leetcode.algorithms;


/**
 * 按奇偶数排序数组
 * 给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
 *
 * 你可以返回满足此条件的任何数组作为答案。
 * 示例：
 *
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 */
public class ArraySort {

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int[] newArray = getNewArray(arr);
        for (int i = 0;i<newArray.length;i++){
            System.out.println(newArray[i]);
        }
    }

    private static int[] getNewArray(int[] arr) {
        //创建相应长度的数组
        int[] newArr = new int[arr.length];
        int left = 0;
        int right = newArr.length-1;
        for (int i = 0;i<arr.length;i++){
            int tmp = arr[i];
            if(tmp%2==0){
                newArr[left] = tmp;
                left++;
            }else {
                newArr[right] = tmp;
                right--;
            }
        }
        return newArr;
    }

}
