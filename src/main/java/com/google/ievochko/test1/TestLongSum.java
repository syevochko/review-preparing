package com.google.ievochko.test1;

public class TestLongSum {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        System.out.println(sum1());
        System.out.println("1: " + (System.currentTimeMillis() - t1));
        t1 = System.currentTimeMillis();
        System.out.println(sum2());
        System.out.println("2: " + (System.currentTimeMillis() - t1));
    }

    private static long sum1() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }

    private static long sum2() {
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }
}
