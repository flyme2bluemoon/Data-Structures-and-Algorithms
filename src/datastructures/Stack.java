package datastructures;

import datastructures.list.SinglyLinkedList;

public class Stack {
    SinglyLinkedList list;

    public Stack() {
        list = new SinglyLinkedList();
    }

    public void push(int e) {
        list.addFirst(e);
    }

    public int pop() {
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.getSize() == 0;
    }

    public int peek() {
        int value = this.pop();
        this.push(value);
        return value;
    }

    public String toString() {
        return list.toString();
    }
}
