package com.robertjli.dsa.dequexercise;

/**
 * A double-ended queue backed by a linked list.
 */
public class LinkedHeque<T> implements Heque<T> {

    // This is public for testing purposes
    public Node head;

    @Override
    public void pushFront(T element) {
        // (TODO) Implement
    }

    @Override
    public void pushBack(T element) {
        // (TODO) Implement
    }

    @Override
    public T popFront() {
        // (TODO) Implement
        return null;
    }

    @Override
    public T popBack() {
        // (TODO) Implement
        return null;
    }

    @Override
    public T peekFront() {
        // (TODO) Implement
        return null;
    }

    @Override
    public T peekBack() {
        // (TODO) Implement
        return null;
    }

    // This is public for testing purposes
    public class Node {
        public T value;
        public Node next;
        public Node previous;
    }
}
