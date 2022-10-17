package algorithms.sorting.quadratic;

import algorithms.sorting.Sort;

import java.util.Arrays;

public class InsertionSort extends Sort {
    public InsertionSort(int[] arr) {
        super(arr);
    }

    @Override
    public void sort() {
//        System.out.println("=> " + Arrays.toString(arr));
        for (int i = 1; i < arr.length - 1; i++) {
            int tmp = arr[i];
            // shift element backwards until it is in the correct position
            int j;
            for (j = i; j > 0 && tmp < arr[j-1]; j--) {
                arr[j] = arr[j-1];
            }
            arr[j] = tmp;
//            System.out.println("   " + Arrays.toString(arr));
        }
//        System.out.println();
    }
}
