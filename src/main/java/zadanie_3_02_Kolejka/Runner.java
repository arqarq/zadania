package zadanie_3_02_Kolejka;

import java.util.EmptyStackException;

class Runner {
    public static void main(String[] args) throws EmptyQueue {
        int el = 10;
        Queue queue = new Queue(el);

        System.out.println("Poprawnie wpisano int = " + el + " do kolejki: " + queue.enqueue(10));
        queue.enqueue(11);
        queue.enqueue(12);
        System.out.println(queue.peak());
        System.out.println(queue.dequeue());
        System.out.println(queue.peak());
        queue.enqueue(13);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println("Queue pusta: " + queue.isEmpty());
        System.out.println("Queue pełna: " + queue.isFull());
        try {                                                                       // nie przerywa działania programu!
            System.out.println(queue.dequeue());
        } catch (EmptyStackException e) {
            e.printStackTrace();
            System.err.println("Pusta kolejka!");
        }
        queue.peak();
    }
}