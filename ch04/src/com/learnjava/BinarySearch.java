package com.learnjava;

//二分查找要求数组有序
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99, 66};
        //int target = 66;
        int target = 100;

        int head = 0, end = arr.length - 1;

        boolean isFlag = false;
        while (head <= end) {
            int mid = (head + end) / 2;

            if (target == arr[mid]) {
                System.out.println("You've found " + target + ", whose index is " + mid + ".");
                isFlag = true;
                break;
            } else if (target > arr[mid]) {
                head = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (!isFlag) {
            System.out.println("Sorry, there is no " + target + " in arr.");
        }
    }
}
