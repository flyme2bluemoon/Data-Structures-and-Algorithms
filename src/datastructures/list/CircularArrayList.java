package datastructures.list;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CircularArrayList {
    int[] arr;
    int head, size;

    public CircularArrayList() {
        this.arr = new int[4];
        this.head = 0;
        this.size = 0;
    }

    public void addLast(int e) {
        if (this.size >= this.arr.length) {
            this.resize();
        }
        this.size++;
        this.arr[this.getTail()] = e;
    }

    public int removeFirst() {
        if (size <= 0) {
            throw new NoSuchElementException();
        }
        int first = this.arr[head];
        this.head++;
        this.size--;
        return first;
    }

    private void resize() {
        int newArr[] = new int[this.arr.length * 2];
        for (int i = 0; i < this.size; i++) {
            newArr[i] = this.get(i);
        }
        this.arr = newArr;
        this.head = 0;
    }

    public int get(int i) {
        return this.arr[Math.floorMod(this.head+i, this.arr.length)];
    }

    private int getTail() {
        return Math.floorMod(this.head+this.size-1, this.arr.length);
    }

    public String toString() {
        int[] arr = new int[this.size];
        for (int i = 0; i < this.size; i++) {
            arr[i] = this.get(i);
        }
        return Arrays.toString(arr);
    }
}
