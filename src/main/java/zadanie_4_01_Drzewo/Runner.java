package zadanie_4_01_Drzewo;

class Runner {
    public static void main(String[] aaa) {
        Tree<String> tree = new Tree<>();

        Node<String> node1 = new Node<>("1");
        Node<String> node2 = new Node<>("2");
        Node<String> node3 = new Node<>("3");
        Node<String> node4 = new Node<>("4");
        Node<String> node5 = new Node<>("5");

        tree.setRoot(node1);
        node1.setLeft(node2);
//        node1.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node3);
        node4.setRight(node5);

        System.out.println("---In Order");
        tree.traverseInOrder(tree.getRoot());
        System.out.format("%n---Pre Order%n");
        tree.traversePreOrder(tree.getRoot());
        System.out.format("%n---Post Order%n");
        tree.traversePostOrder(tree.getRoot());
    }
}