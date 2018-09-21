package zadaniaProg1;

import java.util.Arrays;
import java.util.EmptyStackException;

class ZadanieStos {
    public static void main(String[] args) {
        IntStack stack = new IntStack(10);
        System.out.println("Stos pusty: " + stack.isEmpty());
        for (int i = 0; i < 20; i++) {
            stack.push(i + 1);
        }
        System.out.println("Stos pełny: " + stack.isFull());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println("Stos pełny: " + stack.isFull());
        System.out.println(stack);
    }

    static class IntStack {
        private int top = -1;
        private int[] array;

        IntStack(int size) {
            this.array = new int[size];
        }

        boolean push(int el) {
            if (top < array.length - 1) {
                array[++top] = el;
                return true;
            }
            return false;
        }

        int pop() {
            if (top >= 0) {
                return array[top--];
            }
            throw new EmptyStackException();
        }

        int peek() {
            if (top >= 0) {
                return array[top];
            }
            throw new EmptyStackException();
        }

        boolean isEmpty() {
            return top == -1;
        }

        boolean isFull() {
            return top == array.length - 1;
        }

        @Override
        public String toString() {
            return Arrays.toString(array) + " [top: " + top + "] = " + array[top];
        }
    }
}