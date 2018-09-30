package zadanie_5_02_DecToBinStack;

import java.util.Arrays;
import java.util.EmptyStackException;

class IntStack {
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
        return Arrays.toString(array) +
                " [top: " + top +
                "] = " + array[top];
    }
}