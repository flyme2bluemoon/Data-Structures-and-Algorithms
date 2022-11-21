import algorithms.sorting.quadratic.*;
import datastructures.list.*;

import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        testSortingAlgorithms();
        testArrayList();
        testLinkedList();
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

    private static void testArrayList() {
        ArrayList al = new ArrayList();
        for (int i = 0; i < 80; i++) {
            al.add(i);
        }
        System.out.println(al);
        System.out.println(al.get(69));
        System.out.println(al.get(42));
        al.set(42, 420);
        System.out.println(al.get(42));
        al.remove(5);
        System.out.println(al);
        al.add(6, 5);
        System.out.println(al);
    }

    private static void testLinkedList() {
        SinglyLinkedList sLinkedList = new SinglyLinkedList();
        for (int i = 1; i <= 10; i++) {
            sLinkedList.addLast(i);
        }
        System.out.println(sLinkedList);
        for (int i = -1; i >= -10; i--) {
            sLinkedList.addFirst(i);
        }
        System.out.println(sLinkedList);
        for (int i = 1; i <= 10; i++) {
            System.out.println(sLinkedList.removeFirst());
            System.out.println(sLinkedList.removeLast());
            System.out.println(sLinkedList);
        }
    }
}
