package com.robertjli.dsa.dequexercise.test;

import com.robertjli.dsa.dequexercise.ArrHeque;
import org.junit.Assert;

/**
 * Test class for ArrHeque
 */
public class ArrHequeTest {
    ArrHeque<Integer> heque;

    private int size(ArrHeque heque) {
        return heque.array.length;
    }

    @org.junit.Before
    public void setUp() throws Exception {
        heque = new ArrHeque<Integer>();
    }

    @org.junit.Test
    public void testConstructor() throws Exception {
        Assert.assertEquals(ArrHeque.INITIAL_CAPACITY, size(heque));
        Assert.assertArrayEquals(new Integer[ArrHeque.INITIAL_CAPACITY], heque.array);
    }

    @org.junit.Test
    public void testPushFront() throws Exception {
        heque.pushFront(5);
        Assert.assertEquals(1, size(heque));
        Assert.assertArrayEquals(new Integer[]{5}, heque.array);

        heque.pushFront(10);
        Assert.assertEquals(2, size(heque));

        heque.pushFront(15);
        Assert.assertEquals(3, size(heque));
        Assert.assertEquals((Integer) 10, heque.array[1]);
    }

    @org.junit.Test
    public void testPushBack() throws Exception {
        heque.pushBack(5);
        Assert.assertEquals(1, size(heque));
        Assert.assertArrayEquals(new Integer[]{5}, heque.array);

        heque.pushBack(10);
        Assert.assertEquals(2, size(heque));

        heque.pushBack(15);
        Assert.assertEquals(3, size(heque));
        Assert.assertEquals((Integer) 10, heque.array[1]);
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

    @org.junit.Test
    public void testCapacity() throws Exception {
        for (int i = 0; i < ArrHeque.INITIAL_CAPACITY * 10; ++i) {
            heque.pushFront(i);
        }
        Assert.assertEquals((Integer) ArrHeque.INITIAL_CAPACITY * 10, size(heque));
    }

}
