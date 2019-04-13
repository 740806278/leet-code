package com.zhy.leetcode.algorithms;


/**
 * 矩形翻转
 * 给定一个矩阵 A， 返回 A 的转置矩阵。
 *
 * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 *
 * 示例 1：
 * 输入：[[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[[1,4,7],[2,5,8],[3,6,9]]
 *
 * 示例 2：
 * 输入：[[1,2,3],[4,5,6]]
 * 输出：[[1,4],[2,5],[3,6]]
 */

public class Transpose {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] tmp =  transpose(arr);
        for(int i = 0 ; i< tmp.length ; i++){
            for(int j = 0 ; j< tmp.length ; j++){
                System.out.println(tmp[i][j] + " ");
            }
        }
    }

    public static int[][] transpose(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
        int[][] newArr = new int[c][r];
        for(int tmpr = 0; tmpr < r ; tmpr++){
            for(int tmpc = 0 ; tmpc < c; tmpc++){
                newArr[tmpc][tmpr] = arr[tmpr][tmpc];
            }
        }
        return newArr;
    }

}
