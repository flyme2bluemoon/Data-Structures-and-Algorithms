package datastructures.list;

import java.util.Arrays;

public class ArrayList {
    private int[] arr;
    private int size = 0;

    public ArrayList() {
        this.arr = new int[10];
    }

    public int get(int i) {
        if (i >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        return arr[i];
    }

    public int set(int i, int e) {
        if (i >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        int prev = this.arr[i];
        this.arr[i] = e;
        return prev;
    }

    public void add (int e) {
        if (this.size >= this.arr.length) {
            this.resize();
        }
        this.arr[this.size] = e;
        this.size++;
    }

    public void add (int i, int e) {
        if (i >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        if (this.size >= this.arr.length) {
            this.resize();
        }
        for (int j = this.size; j > i; j--) {
            this.arr[j] = this.arr[j-1];
        }
        this.arr[i] = e;
        this.size++;
    }

    public int remove(int i) {
        if (i >= size) {
            throw new IndexOutOfBoundsException();
        }
        int removed = this.arr[i];
        for (int j = i; j < this.size; j++) {
            this.arr[j] = this.arr[j+1];
        }
        this.size--;
        return removed;
    }

    public String toString() {
        int stringArr[] = new int[this.size];
        for (int i = 0; i < this.size; i++) {
            stringArr[i] = this.arr[i];
        }
        return Arrays.toString(stringArr);
    }

    private void resize() {
        int[] copy = new int[(int)(this.arr.length * 1.5)];
        for (int i = 0; i < this.arr.length; i++) {
            copy[i] = this.arr[i];
        }
        this.arr = copy;
    }
}
