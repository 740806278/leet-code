package com.zhy.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角：
 * 它的两条斜边都是由数字1组成的，而其余的数则是等于它肩上的两个数之和。
 */
public class YangHuiNew {

    public static void main(String[] args) {
        List<List<Integer>> generate = generate(8);
        for (int i = 0;i<generate.size();i++){
            System.out.println(generate.get(i));
        }
    }

    public static List<List<Integer>> generate(int numRows){
        //初始化
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if(numRows <= 0){
            return res;


        }

        for(int i = 0;i<numRows;i++){
            List<Integer> list = new ArrayList<Integer>();
            for(int j = 0;j <= i;j++){
                if(j == 0 || j == i){
                    list.add(1);
                }else {
                    list.add(res.get(i-1).get(j)+res.get(i-1).get(j-1));
                }
            }
             res.add(list);
        }
        return res;
    }




}
