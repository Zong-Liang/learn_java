package com.learnjava;

import java.util.Arrays;

//操作数组的工具类
public class ArraysClass {
    public static void main(String[] args) {
        //比较两个数组是否相等
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {1, 2, 3, 4, 5};

        System.out.println(arr == arr1);  //比较地址

        boolean isEquals = Arrays.equals(arr, arr1);
        System.out.println(isEquals);  //比较数组内元素

        //输出数组元素信息
        System.out.println(arr);  //地址值
        System.out.println(Arrays.toString(arr));  //打印数组内元素

        //将指定值填充到数组之中
        Arrays.fill(arr, 6);
        System.out.println(Arrays.toString(arr));

        //使用快速排序算法进行排序
        int[] arr2 = {88, 99, 66, 55, 11, 22, 66, 33, 77, 44};
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //有序数组进行二分查找
        int[] arr3 = {11, 22, 33, 44, 55, 66, 66, 77, 88, 99};
        int target = 55;
        int index = Arrays.binarySearch(arr3, target);
        if (index > 0) {
            System.out.println(target + " Found, it's index is " + index);
        } else {
            System.out.println(target + "Not Found");
        }
    }
}
