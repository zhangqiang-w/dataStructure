package com.paofu.data_structure.demo.day01;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 * @Author: 泡芙和树
 * @Date: 2022/1/20 11:44
 * 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
 *
 * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去
 * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x** 0.5
 * 示例 1：
 * 输入：x = 4
 * 输出：2
 * 示例 2：
 * 输入：x = 8
 * 输出：2
 * 解释：8 的算术平方根是 2.82842..., 由于返回类型是整数，小数部分将被舍去。
 */
public class Demo16 {

    public static void main(String[] args) {
        int x = 1;
        System.out.println(mySqrt(x));
        System.out.println(mySqrt1(x));
    }

    public static int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }

    public static int mySqrt1(int x) {
        int left = 0;
        int right = x;
        int res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid <= x) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
}
