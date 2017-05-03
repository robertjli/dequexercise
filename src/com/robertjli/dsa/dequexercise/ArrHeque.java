package com.robertjli.dsa.dequexercise;

/**
 * A double-ended queue backed by an array.
 */
public class ArrHeque<T> implements Heque<T> {

    // This is public for testing purposes
    public static int INITIAL_CAPACITY = 512;

    // This is public for testing purposes
    public T[] array;

    public ArrHeque() {
        array = (T[]) new Object[INITIAL_CAPACITY];
    }

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
}
