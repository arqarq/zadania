package zadanie_4_01_Drzewo;

class Tree<T> {
    private Node<T> root;

    void traverseInOrder(Node<T> node) {
        if (node != null){
            traverseInOrder(node.getLeft());
            visit(node);
            traverseInOrder(node.getRight());
        }
    }

    void traversePreOrder(Node<T> node) {
        if (node != null){
            visit(node);
            traversePreOrder(node.getLeft());
            traversePreOrder(node.getRight());
        }
    }

    void traversePostOrder(Node<T> node) {
        if (node != null){
            traversePostOrder(node.getLeft());
            traversePostOrder(node.getRight());
            visit(node);
        }
    }

    void visit(Node<T> node){
        System.out.print(node.getValue() + " ");
    }

    void setRoot(Node<T> root) {
        this.root = root;
    }
}