package com.learnjava;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{34, 54, 3, 56, 47, 65, 98, 71};

        //遍历
        for (int j : arr) {
            System.out.print(j + "\t");
        }

        //逆置
        //方法一
        for (int i = 0; i < arr.length / 2; i++) {
            //交换arr[i]与arr[arr.length-1-i]位置的元素
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println();

        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //方法二
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            //交换arr[i]与arr[j]位置的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println();

        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
