package com.learnjava;

public class ArrayException {
    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException
        int[] arr = new int[6];
        //System.out.println(arr[6]);

        //NullPointerException
        int[] arr1 = new int[6];
        arr1 = null;
        //System.out.println(arr1[0]);

        int[][] arr2 = new int[6][];
        //System.out.println(arr2[0][0]);

        String[] arr3 = new String[6];
        System.out.println(arr3[0].toString());
    }
}
