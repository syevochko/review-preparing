package com.google.ievochko;

import java.util.Arrays;

/**
 * Having two separate sorted arrays,
 * write java function merging these arrays in single sorted array without sorting it
 */
public class MergeSortedArraysInto1Sorted {
    public static void main(String[] args) {
        MergeSortedArraysInto1Sorted merger = new MergeSortedArraysInto1Sorted();
        String[] arr1 = {"1", "3", "7", "9"};
        String[] arr2 = {"2", "4", "5", "6", "8"};
        System.out.println(Arrays.asList(merger.mergeSortedArrays(arr1, arr2)));
    }

    public String[] mergeSortedArrays(String[] arr1, String[] arr2)  {
        if (arr1 == null || arr1.length == 0)   {
            return arr2;
        }
        if (arr2 == null || arr2.length == 0)   {
            return arr1;
        }
        String[] result = new String[arr1.length + arr2.length];
        int i = 0, i1 = 0, i2 = 0;
        while (i < result.length)   {
            if (i1 >= arr1.length) {
                System.arraycopy(arr2, i2, result, i, result.length - i);
                break;
            }
            if (i2 >= arr2.length) {
                System.arraycopy(arr1, i1, result, i, result.length - i);
                break;
            }

            if (arr1[i1].compareTo(arr2[i2]) <= 0) {
                result[i] = arr1[i1];
                i1++;
            } else {
                result[i] = arr2[i2];
                i2++;
            }
            i++;
        }
        return result;
    }
}
