package com.robertjli.dsa.dequexercise.test;

import com.robertjli.dsa.dequexercise.LinkedHeque;
import org.junit.Assert;

/**
 * Test class for LinkedHeque
 */
public class LinkedHequeTest {
    LinkedHeque<Integer> heque;

    private int size(LinkedHeque heque) {
        int size = 0;
        LinkedHeque.Node current = heque.head;
        while (current != null) {
            ++size;
            current = current.next;
        }
        return size;
    }

    private <T> T[] toArray(LinkedHeque<T> heque) {
        T[] array = (T[]) new Object[size(heque)];
        LinkedHeque.Node current = heque.head;
        for (int i = 0; i < array.length; ++i) {
            array[i] = (T) current.value;
        }
        return array;
    }

    @org.junit.Before
    public void setUp() throws Exception {
        heque = new LinkedHeque<Integer>();
    }

    @org.junit.Test
    public void testConstructor() throws Exception {
        Assert.assertEquals(0, size(heque));
        Assert.assertArrayEquals(new Integer[]{}, toArray(heque));
        Assert.assertNull(heque.head);
    }

    @org.junit.Test
    public void testPushFront() throws Exception {
        heque.pushFront(5);
        Assert.assertEquals(1, size(heque));
        Assert.assertArrayEquals(new Integer[]{5}, toArray(heque));

        heque.pushFront(10);
        Assert.assertEquals(2, size(heque));

        heque.pushFront(15);
        Assert.assertEquals(3, size(heque));
        Assert.assertEquals((Integer) 10, toArray(heque)[1]);
    }

    @org.junit.Test
    public void testPushBack() throws Exception {
        heque.pushBack(5);
        Assert.assertEquals(1, size(heque));
        Assert.assertArrayEquals(new Integer[]{5}, toArray(heque));

        heque.pushBack(10);
        Assert.assertEquals(2, size(heque));

        heque.pushBack(15);
        Assert.assertEquals(3, size(heque));
        Assert.assertEquals((Integer) 10, toArray(heque)[1]);
    }

    @org.junit.Test
    public void testPopFrontOneElement() throws Exception {
        heque.pushFront(5);
        Assert.assertEquals((Integer) 5, heque.popFront());
        Assert.assertEquals(0, size(heque));
    }

    @org.junit.Test
    public void testPopFrontMoreElements() throws Exception {
        heque.pushFront(5);
        heque.pushFront(10);
        heque.pushFront(15);

        Assert.assertEquals((Integer) 15, heque.popFront());
        Assert.assertEquals(2, size(heque));

        heque.pushFront(20);

        Assert.assertEquals((Integer) 20, heque.popFront());
        Assert.assertEquals(2, size(heque));
        Assert.assertEquals((Integer) 10, heque.popFront());
        Assert.assertEquals(1, size(heque));
        Assert.assertEquals((Integer) 5, heque.popFront());
        Assert.assertEquals(0, size(heque));
    }

    @org.junit.Test
    public void testPopBackOneElement() throws Exception {
        heque.pushBack(5);
        Assert.assertEquals((Integer) 5, heque.popBack());
        Assert.assertEquals(0, size(heque));
    }

    @org.junit.Test
    public void testPopBackMoreElements() throws Exception {
        heque.pushBack(5);
        heque.pushBack(10);
        heque.pushBack(15);

        Assert.assertEquals((Integer) 15, heque.popBack());
        Assert.assertEquals(2, size(heque));

        heque.pushBack(20);

        Assert.assertEquals((Integer) 20, heque.popBack());
        Assert.assertEquals(2, size(heque));
        Assert.assertEquals((Integer) 10, heque.popBack());
        Assert.assertEquals(1, size(heque));
        Assert.assertEquals((Integer) 5, heque.popBack());
        Assert.assertEquals(0, size(heque));
    }

    @org.junit.Test
    public void testPopMixed() throws Exception {
        heque.pushFront(5);
        heque.pushBack(10);
        heque.pushFront(15); // 15, 5, 10

        Assert.assertEquals((Integer) 10, heque.popBack());
        Assert.assertEquals(2, size(heque)); // 15, 5

        heque.pushFront(20); // 20, 15, 5

        Assert.assertEquals((Integer) 5, heque.popBack());
        Assert.assertEquals(2, size(heque));

        heque.pushBack(25);
        heque.pushBack(30); // 20, 15, 25, 30

        Assert.assertEquals((Integer) 30, heque.popBack());
        Assert.assertEquals(3, size(heque));

        Assert.assertEquals((Integer) 25, heque.popBack());
        Assert.assertEquals(2, size(heque));

        Assert.assertEquals((Integer) 15, heque.popBack());
        Assert.assertEquals(1, size(heque));

        Assert.assertEquals((Integer) 20, heque.popBack());
        Assert.assertEquals(0, size(heque));
    }

    @org.junit.Test
    public void testPeekFront() throws Exception {
        heque.pushFront(5);
        Assert.assertEquals((Integer) 5, heque.peekFront());
        Assert.assertEquals(1, size(heque));

        heque.pushFront(10);
        Assert.assertEquals((Integer) 10, heque.peekFront());
        Assert.assertEquals(2, size(heque));

        heque.pushFront(15);
        Assert.assertEquals((Integer) 15, heque.peekFront());
        Assert.assertEquals(3, size(heque));
    }

    @org.junit.Test
    public void testPeekBack() throws Exception {
        heque.pushBack(5);
        Assert.assertEquals((Integer) 5, heque.peekBack());
        Assert.assertEquals(1, size(heque));

        heque.pushBack(10);
        Assert.assertEquals((Integer) 10, heque.peekBack());
        Assert.assertEquals(2, size(heque));

        heque.pushBack(15);
        Assert.assertEquals((Integer) 15, heque.peekBack());
        Assert.assertEquals(3, size(heque));
    }

}
