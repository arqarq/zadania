package zadanie_4_02_BinarySearchTree;

import java.util.Optional;

class Runner {
    public static void main(String[] aaa) {
//        Node<Integer> node1 = new Node<>(1);
        BST<Integer> tree = new BST<>();

        tree.insert(19);
        tree.insert(20);
        tree.insert(21);
        tree.insert(22);
        tree.insert(23);

        System.out.println("---In Order");
        tree.traverseInOrder();
        System.out.format("%n---Pre Order%n");
        tree.traversePreOrder();
        System.out.format("%n---Post Order%n");
        tree.traversePostOrder();
        System.out.println();

        int w = 22;
        Optional<Node<Integer>> n = tree.search(w);
        System.out.println(n.isPresent() ? "Znaleziono " + w + " w " + n.get() : "Nie znaleziono " + w);
        w = 55;
        n = tree.search(w);
        System.out.println(n.isPresent() ? "Znaleziono " + w + " w " + n.get() : "Nie znaleziono " + w);
    }
}