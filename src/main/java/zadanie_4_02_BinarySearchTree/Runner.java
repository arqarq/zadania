package zadanie_4_02_BinarySearchTree;

class Runner {
    public static void main(String[] aaa) {
        Node<Integer> node1 = new Node<>(1);
        BST<Integer> tree = new BST<>(node1);

        System.out.println("---In Order");
        tree.traverseInOrder();
        System.out.format("%n---Pre Order%n");
        tree.traversePreOrder();
        System.out.format("%n---Post Order%n");
        tree.traversePostOrder();
    }
}