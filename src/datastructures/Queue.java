package datastructures;

import datastructures.list.SinglyLinkedList;

public class Queue {
    SinglyLinkedList list;

    public Queue() {
        list = new SinglyLinkedList();
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
