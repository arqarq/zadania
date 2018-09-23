package zadanie_3_02_Kolejka;

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

    private int inkr(int a){
        if (a == array.length - 1){
            return 0;
        }
        return ++a;
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
        rear = inkr(rear);
//        if (rear == array.length - 1) {
//            rear = 0;
//        } else {
//            rear++;
//        }
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
        front = inkr(front);
//        if (front == array.length - 1) {
//            front = 0;
//        } else {
//            front++;
//        }
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