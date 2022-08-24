package DoubleEndedQueue;

/* Interface for implementing all the methods
* that are used in a Deque.
* */

public interface DequeIF<T>{
    /* Returns the size of the Deque data structure */
    int getSize();

    /* Returns a true or false value indicating if the Deque is empty.*/
    boolean isEmpty();

    /* Adds the data to the front end of the deque*/
    void addFirst(T data);

    /* Adds the data to the end of the deque*/
    void addLast(T data);

    /* Returns the first element without removing it */
    T first();

    /* Returns the last element without removing it*/
    T last();

    /* Returns the first element and deletes it */
    T removeFirst();

    /* Returns the last element and deletes it*/
    T removeLast();
}
