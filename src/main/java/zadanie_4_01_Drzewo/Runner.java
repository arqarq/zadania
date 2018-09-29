package zadanie_4_01_Drzewo;

class Runner {
    public static void main(String[] args) {
        Tree<String> tree = new Tree<>();

        Node<String> node1 = new Node<>("1");
        Node<String> node2 = new Node<>("2");
        Node<String> node3 = new Node<>("3");
        Node<String> node4 = new Node<>("4");

        tree.setRoot(node1);
        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);

        System.out.println("---In Order");
        tree.traverseInOrder(node1);
        System.out.println("\n---Pre Order");
        tree.traversePreOrder(node1);
        System.out.println("\n---Post Order");
        tree.traversePostOrder(node1);
    }
}