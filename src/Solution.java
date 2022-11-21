import algorithms.sorting.quadratic.*;
import datastructures.list.*;

import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        testSortingAlgorithms();
        testLists();
    }

    private static void testSortingAlgorithms() {
        System.out.println("Bubble Sort");
        new BubbleSort(new int[]{5, 1, 4, 2, 8}).displayArr();
        new BubbleSort(new int[]{5, 4, 3, 2, 1}).displayArr();
        new BubbleSort(new int[]{1, 2, 3, 4, 5}).displayArr();

        System.out.println("Insertion Sort");
        new SelectionSort(new int[]{5, 1, 4, 2, 8}).displayArr();
        new SelectionSort(new int[]{5, 4, 3, 2, 1}).displayArr();
        new SelectionSort(new int[]{1, 2, 3, 4, 5}).displayArr();

        System.out.println("Insertion Sort");
        new InsertionSort(new int[]{5, 1, 4, 2, 8}).displayArr();
        new InsertionSort(new int[]{5, 4, 3, 2, 1}).displayArr();
        new InsertionSort(new int[]{1, 2, 3, 4, 5}).displayArr();

        System.out.println("Testing with very large arrays");
        long startTime, endTime;
        Random random = new Random();
        final int SIZE = 10000;
        final double SECONDS_PER_NANOSECOND = 1e9;
        int[] arr = new int[SIZE];
        for (int i = 0; i < SIZE; i++)
            arr[i] = random.nextInt(SIZE);

        startTime = System.nanoTime();
        new BubbleSort(arr);
        endTime = System.nanoTime();
        System.out.println("bubble sort (seconds): " + (endTime - startTime) / SECONDS_PER_NANOSECOND);

        startTime = System.nanoTime();
        new SelectionSort(arr);
        endTime = System.nanoTime();
        System.out.println("selection sort (seconds): " + (endTime - startTime) / SECONDS_PER_NANOSECOND);

        startTime = System.nanoTime();
        new InsertionSort(arr);
        endTime = System.nanoTime();
        System.out.println("insertion sort (seconds): " + (endTime - startTime) / SECONDS_PER_NANOSECOND);
    }

    private static void testLists() {
        ArrayList al = new ArrayList();
        al.addLast(0);
        al.addLast(1);
        al.addLast(2);
        al.addLast(3);
        al.addLast(4);
        al.addLast(5);
        al.addLast(6);
        al.addLast(7);
        al.addLast(8);
        al.addLast(10);
        al.removeLast();
        al.addLast(9);
        System.out.println(al);
    }
}
