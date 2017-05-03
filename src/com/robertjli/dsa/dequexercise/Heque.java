package com.robertjli.dsa.dequexercise;

/**
 * A double-ended queue interface.
 */
public interface Heque<T> {

    /**
     * Add `element` to the front of the deque.
     * @param element
     */
    void pushFront(T element);

    /**
     * Add `element` to the back of the deque.
     * @param element
     */
    void pushBack(T element);

    /**
     * Remove the frontmost element from the deque and return it.
     */
    T popFront();

    /**
     * Remove the backmost element from the deque and return it.
     */
    T popBack();

    /**
     * Return the frontmost element from the deque.
     */
    T peekFront();

    /**
     * Return the backmost element from the deque.
     */
    T peekBack();
}
