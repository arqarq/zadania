package zadanie_5_05_CheckIfBinaryTreeIsBST;

class Runner {
    public static void main(String[] aaa) {
        Node<Integer> root = new Node<>(22);
        Node<Integer> node1 = new Node<>(19);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(21);
        Node<Integer> node4 = new Node<>(23);
        Node<Integer> node5 = new Node<>(24);
        Node<Integer> node6 = new Node<>(124);

        BinaryTree<Integer> tree = new BinaryTree<>(root);
        root.setLeft(node2);
        root.setRight(node4);
        node2.setLeft(node1);
        node2.setRight(node3);
        node4.setRight(node5);

        tree.traverseInOrder();
        System.out.printf("%nJest BST: " + tree.checkIfBST() + "%n");

        node4.setLeft(node6);
        tree.traverseInOrder();
        System.out.printf("%nJest BST: " + tree.checkIfBST() + "%n");
    }
}