package zadanie_3_03_Lista;

class Node<T> {
    private final T value;
    private Node<T> next;

    Node(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }

    Node<T> getNext() {
        return next;
    }

    void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}