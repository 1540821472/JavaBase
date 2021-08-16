package com.b_practice;

import java.util.Arrays;

/**
 * 数组排序 + 折半查找指定元素
 *
 * @author
 */
public class ArraySortTest {

    public static int[] arr = {3, 5, 2, 6, 1, 7, 2, 9, 10, 23, 11, 25, 13, 6, 5, 7, 4};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr));

        // 数组工具类自带排序方法
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 选择排序
        selectSort(arr);
        System.out.println(Arrays.toString(arr));

        // 冒泡排序
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        // 折半查找指定元素，前提是数组必须有序，所以要先对数组进行排序。返回元素索引，如果找不到该元素，返回-1
        int index = binSearch(arr, 10);
        System.out.println("index = " + index);
    }

    /**
     * 选择排序 每一轮都找出最小值
     *
     * @param arr int[]
     */
    public static void selectSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    /**
     * 冒泡排序 每一轮都找出最大值
     *
     * @param arr int[]
     */
    public static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 折半查找指定元素 前提是数组必须有序，所以要先对数组进行排序
     *
     * @param arr int[]
     * @param b   需要查找的元素
     */
    public static int binSearch(int[] arr, int b) {
        Arrays.sort(arr);
        int min = 0, max = arr.length - 1, mid;

        while (min <= max) {
            mid = (min + max) / 2;
            if (arr[mid] < b) {
                min = mid + 1;
            } else if (arr[mid] > b) {
                max = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
