package zadanie_4_01_Drzewo;

class Node<T> {
    private T value;
    private Node<T> left;
    private Node<T> right;

    Node(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getLeft() {
        return left;
    }

    void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    void setRight(Node<T> right) {
        this.right = right;
    }
}