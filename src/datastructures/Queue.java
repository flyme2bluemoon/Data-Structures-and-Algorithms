package datastructures;

import datastructures.list.CircularArrayList;

public class Queue {
    CircularArrayList list;

    public Queue() {
        list = new CircularArrayList();
    }

    public void enqueue(int e) {
        list.addLast(e);
    }

    public int dequeue() {
        return list.removeFirst();
    }

    public String toString() {
        return list.toString();
    }
}
