package zadanie_5_05_CheckIfBinaryTreeIsBST;

class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    BinaryTree(Node<T> root) {
        this.root = root;
    }

    private void traverseInOrder(Node<T> node) {
        if (node != null) {
            traverseInOrder(node.getLeft());
            visit(node);
            traverseInOrder(node.getRight());
        }
    }

    void traverseInOrder() {
        traverseInOrder(root);
    }

    private boolean checkIfBST(Node<T> node) {
        if (node != null) {
            if (node.getLeft() != null && node.getLeft().getValue().compareTo(node.getValue()) > 0) {
                return false;
            }
            if (node.getRight() != null && node.getRight().getValue().compareTo(node.getValue()) <= 0) {
                return false;
            }
            return checkIfBST(node.getLeft()) && checkIfBST(node.getRight());
        }
        return true;
    }

    boolean checkIfBST() {
        return checkIfBST(root);
    }

    private void traversePreOrder(Node<T> node) {
        if (node != null) {
            visit(node);
            traversePreOrder(node.getLeft());
            traversePreOrder(node.getRight());
        }
    }

    void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePostOrder(Node<T> node) {
        if (node != null) {
            traversePostOrder(node.getLeft());
            traversePostOrder(node.getRight());
            visit(node);
        }
    }

    void traversePostOrder() {
        traversePostOrder(root);
    }

    private void visit(Node<T> node) {
        System.out.print(node.getValue() + " ");
    }

/*    void setRoot(Node<T> root) {
        this.root = root;
    }*/

    Node<T> getRoot() {
        return root;
    }
}