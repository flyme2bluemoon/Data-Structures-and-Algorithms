package datastructures;

import datastructures.list.SLinkedList;

public class Stack {
    SLinkedList list;

    public Stack() {
        list = new SLinkedList();
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

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.push(4);
        System.out.println(stack);
    }
}
