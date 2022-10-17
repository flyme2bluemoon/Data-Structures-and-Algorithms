package algorithms.sorting.quadratic;

import algorithms.sorting.Sort;

import java.util.Arrays;

public class BubbleSort extends Sort {
    public BubbleSort(int[] arr) {
        super(arr);
    }

    @Override
    public void sort() {
//        System.out.println("=> " + Arrays.toString(arr));
        boolean sorted = false;
        // iterate through the list n - 1 times since last element is by default the smallest
        for (int i = 0; i < arr.length - 1 && !sorted; i++) {
            // i also indicates the size of sorted section at the end of the array
            // subtract one to prevent out of bounds error with arr[j+1]
            sorted = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    sorted = false;
                }
            }
//            System.out.println("   " + Arrays.toString(arr));
        }
//        System.out.println();
    }
}
