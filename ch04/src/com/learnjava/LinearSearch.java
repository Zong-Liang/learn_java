package com.learnjava;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99, 66};
        int target = 66;
        //int target = 100;

        boolean isFlag = false;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("You've found " + target + ", whose index is " + i + ".");
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Sorry, there is no " + target + " in arr.");
        }
    }
}
