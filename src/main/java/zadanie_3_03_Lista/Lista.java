package zadanie_3_03_Lista;

import java.util.Optional;

class Lista<T> {
    private Node<T> head = null;
    private Node<T> current;
    private Node<T> current_before;

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
        if (index == 0) {
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

    void delete(int index) {
        if (head == null) {
            return;
        }
        if (index == 0) {                               // na wypadek kasowania pierwszego (0) elementu
            head = head.getNext();
            return;
        }
        if (head.getNext() == null) {                   // na wypadek kolejki jednoelementowej, kasuje ten jeden element
            head = null;
            return;
        }
        current = head;
//        current_before = current;
        while (current.getNext() != null && index > 0) {
            current_before = current;
            current = current.getNext();
            index--;
        }
        current_before.setNext(current.getNext());
        current.setNext(null);                          // koniecznie to? (w algorytmie w PDF jest)
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Lista: ");
        current = head;
        while (current != null) {
            s.append(current.getValue()).append(", ");
            current = current.getNext();
        }
        if (s.toString().equals("Lista: ")) {
            return s.append("{null}").toString();
        } else {
            return s.substring(0, s.length() - 2);
        }
    }
}