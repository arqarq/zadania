package zadanie_5_05_CheckIfBinaryTreeIsBST;

import java.util.Optional;

class BST<T extends Comparable<T>> {
    private Node<T> root;

//    BST(Node<T> root) {
//        this.root = root;
//    }

/*    Node<T> getRoot() {
        return root;
    }

    void setRoot(Node<T> root) {
        this.root = root;
    }*/

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

    private boolean traverseInOrderWithCheck(Node<T> node) {
        if (node != null) {
            if (node.getLeft() != null && node.getLeft().getValue().compareTo(node.getValue()) > 0) {
                return false;
            }
            if (node.getRight() != null && node.getRight().getValue().compareTo(node.getValue()) <= 0) {
                return false;
            }
            traverseInOrderWithCheck(node.getLeft());
            traverseInOrderWithCheck(node.getRight());
        }
        return true;
    }

    boolean traverseInOrderWithCheck() {
        return traverseInOrderWithCheck(root);
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

    void insert(T value) {
        Node<T> node = new Node<>(value);

        if (root == null) {
            root = node;
            return;
        }
        Node<T> current = root;
        while (true) {
            if (node.getValue().compareTo(current.getValue()) < 0) {
                if (current.getLeft() == null) {
                    current.setLeft(node);
                    return;
                }
                current = current.getLeft();
            } else {
                if (current.getRight() == null) {
                    current.setRight(node);
                    return;
                }
                current = current.getRight();
            }
        }
    }

    Optional<Node<T>> search(T value) {
        if (root == null) {
            return Optional.empty();
        }
//        if(root.getValue().equals(value)){
//            return Optional.of(root);
//        }
        Node<T> current = root;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return Optional.of(current);
            }
            if (current.getValue().compareTo(value) < 0) {
                current = current.getRight();
            } else {
                current = current.getLeft();
            }
        }
        return Optional.empty();
    }
}