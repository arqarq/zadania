package zadanieLista;

import java.util.Optional;

class Lista<T> {
    private Node<T> head = null;
    private Node<T> current;

    Optional<Node<T>> search(T value) {
        if (head == null) {
            return Optional.empty();
        }
        current = head;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return Optional.of(current);
            }
            current = current.getNext();
        }
        return Optional.empty();
    }

    void append(T value) {
        Node<T> node = new Node<>(value);
        if (head == null) {
            head = node;
            return;
        }
        current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(node);
    }

    void insert(T value, int index) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            return;
        }
        if (index == 0){
            newNode.setNext(head);
            head = newNode;
            return;
        }
        current = head;
        while (current.getNext() != null && index - 1 > 0) {
            current = current.getNext();
            index--;
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    @Override
    public String toString() {
        String s = "Lista: ";
        current = head;
        while (current != null) {
            s += current.getValue() + ", ";
            current = current.getNext();
        }
        return s;
    }
}