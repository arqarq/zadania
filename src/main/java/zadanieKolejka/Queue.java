package zadanieKolejka;

import java.util.EmptyStackException;

class Queue {
    private int[] array;
    private int front;
    private int rear;
    private int count;

    Queue(int size) {
        this.array = new int[size];
        this.count = 0;
        this.front = -1;
        this.rear = -1;
    }

    boolean enqueue(int el) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            front++;
            rear++;
            array[rear] = el;
            count++;
            return true;
        }
        if (rear == array.length - 1) {
            rear = 0;
        } else {
            rear++;
        }
        array[rear] = el;
        count++;
        return true;
    }

    int dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int temp = array[front];
        count--;
        if (front == array.length - 1) {
            front = 0;
        } else {
            front++;
        }
        if (count == 0) {
            front = -1;
            rear = -1;
        }
        return temp;
    }

    int peak() throws EmptyQueue {
        if (isEmpty()) {
            throw new EmptyQueue();
        }
        return array[front];
    }

    boolean isEmpty() {
        return count == 0;
    }

    boolean isFull() {
        return count == array.length;
    }
}