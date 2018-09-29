package zadanie_4_01_Drzewo;

class Runner {
    public static void main(String[] aaa) {
        Node<String> node1 = new Node<>("1");
        Node<String> node2 = new Node<>("2");
        Node<String> node3 = new Node<>("3");
        Node<String> node4 = new Node<>("4");
        Node<String> node5 = new Node<>("5");

        BinaryTree<String> tree = new BinaryTree<>(node1);
//        tree.setRoot(node1); // setterem
        node1.setLeft(node2);
        node2.setLeft(node4);
        node2.setRight(node3);
        node4.setRight(node5);

        System.out.println("---In Order");
        tree.traverseInOrder();
        System.out.format("%n---Pre Order%n");
        tree.traversePreOrder();
        System.out.format("%n---Post Order%n");
        tree.traversePostOrder();
    }
}