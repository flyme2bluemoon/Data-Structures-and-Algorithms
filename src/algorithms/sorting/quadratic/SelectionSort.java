package algorithms.sorting.quadratic;

import algorithms.sorting.Sort;

import java.util.Arrays;

public class SelectionSort extends Sort {
    public SelectionSort(int[] arr) {
        super(arr);
    }

    @Override
    public void sort() {
//        System.out.println("=> " + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            if (i != min_idx) {
                int tmp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = tmp;
            }
//            System.out.println("   " + Arrays.toString(arr));
        }
//        System.out.println();
    }
}
