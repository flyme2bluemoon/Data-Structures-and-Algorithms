import datastructures.Queue;

import java.util.NoSuchElementException;

public class QueueTester {
    public static void main(String[] args) {
        queueTester();
    }

    private static void queueTester() {
        Queue q = new Queue();
        q.enqueue(1);
        System.out.println(q);
        q.enqueue(2);
        System.out.println(q);
        q.dequeue();
        System.out.println(q);
        q.enqueue(3);
        System.out.println(q);
        q.enqueue(4);
        System.out.println(q);
        q.enqueue(5);
        System.out.println(q);
        q.dequeue();
        System.out.println(q);
        q.enqueue(6);
        System.out.println(q);
        q.enqueue(7);
        System.out.println(q);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println(q);
        try {
            q.dequeue();
        } catch (NoSuchElementException e) {
            System.err.printf("Caught \"%s\" as expected\n", e);
        }
    }
}
