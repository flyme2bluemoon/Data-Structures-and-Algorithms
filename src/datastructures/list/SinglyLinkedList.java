package datastructures.list;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class SinglyLinkedList {
    private SNode head;
    private SNode tail;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(int e) {
        SNode newNode = new SNode(e);
        newNode.next = this.head;
        if (this.head == null) {
            this.tail = newNode;
        }
        this.head = newNode;
        this.size++;
    }

    public int removeFirst() {
        if (this.size == 0) {
            throw new NoSuchElementException();
        }
        SNode removed = this.head;
        this.head = this.head.next;
        this.size--;
        if (this.size == 0) {
            this.head = null;
        }
        removed.next = null; // optional
        return removed.element;
    }

    public void addLast(int e) {
        SNode newNode = new SNode(e);
        if (this.size == 0) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
        }
        this.tail = newNode;
        this.size++;
    }

    public int removeLast() {
        if (this.size == 0) {
            throw new NoSuchElementException();
        }
        SNode removed = this.tail;
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            SNode cur = this.head;
            while (cur.next != this.tail) {
                cur = cur.next;
            }
            this.tail = cur;
            this.tail.next = null;
        }
        this.size--;
        return removed.element;
    }

    public int getSize() {
        return this.size;
    }

    public String toString() {
        if (this.size == 0) {
            return "[]";
        }
        int arr[] = new int[this.size];
        SNode cur = this.head;
        for (int i = 0; i < this.size; i++) {
            arr[i] = cur.element;
            cur = cur.next;
        }
        return Arrays.toString(arr);
    }

    private class SNode {
        int element;
        SNode next;

        public SNode() {}

        public SNode(int e) {
            this.element = e;
        }
    }
}
