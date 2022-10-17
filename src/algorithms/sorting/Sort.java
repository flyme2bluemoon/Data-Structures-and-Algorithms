package algorithms.sorting;

import java.util.Arrays;

abstract public class Sort {
    protected int[] arr;

    public Sort(int[] arr) {
        this.arr = arr;
        this.sort(); // polymorphism calling means that the correct and overridden sort method will be called
    }

    public abstract void sort();

    final public int[] getArr() {
        return arr;
    }

    final public void displayArr() {
        System.out.println(Arrays.toString(arr));
    }
}
