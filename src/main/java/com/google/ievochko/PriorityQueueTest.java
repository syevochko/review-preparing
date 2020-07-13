package com.google.ievochko;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Integer::compare);
        pq.addAll(Arrays.asList(1, 3, -1, 30, 100, -100, 23));
        Integer i;
        while ((i = pq.poll()) != null)   {
            System.out.println(i);
        }
    }
}
