package com.google.ievochko;

import java.util.Arrays;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length) {
            int j = i + 1;
            while (j < nums.length && nums[i] == nums[j]) {
                j++;
            }
            if (i + 1 != j) {
                i = j;
            } else {
                break;
            }
        }

        return i < nums.length ? nums[i] : -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3,6};
        System.out.println("1: " + singleNumber(nums));
        nums = new int[]{1,2,1,2,3,6};
        System.out.println("2: " + singleNumber(nums));
        nums = new int[]{6,6};
        System.out.println("2: " + singleNumber(nums));
    }
}
