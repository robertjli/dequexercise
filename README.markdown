# Dequexercise

##### A deque exercise

### Intro

We're going to create our own implementation of a double-ended queue, or deque (pronounced "deck"). A deque is an abstract data type that gives us the best of both worlds between a stack and a queue; namely,you can push, pop, or peek from either end. As with most abstract data types, there are multiple data structures you can use to implement them. In this case, we will make two versions - one with an array, and one with a doubly linked list.

### Heque

In order to avoid confusion with the standard Java interface Deque, I've created my own deque interface named Heque (naturally, this is pronounced "heck"). Like any good data type, we're going to use generics so that our users can put whatever they want into it.

There are six methods that your implementations will need to override:

* `void pushFront(T element)`
* `void pushBack(T element)`
* `T popFront()`
* `T popBack()`
* `T peekFront()`
* `T peekBack()`

### ArrHeque

`ArrHeque` is our array-backed implementation. I've created a local `T[] array` field for you, so please use that to store your data - the unit tests will be looking for it. Keep in mind that while I've specified an initial capacity, you should be able to handle the case where your user puts more than that into your array.

### LinkedHeque

`LinkedHeque` is the linked-list-backed implementation. Take note of the `Node` class inside this class, and use the `Node head` field as the root of your linked list. Feel free to create more fields as needed to make your implementation efficient.

### JUnit Tests

Create a JUnit run configuration that looks like this:

![JUnit Run Configuration](img/test-config.png)

This should run all the tests in the `test` package.
