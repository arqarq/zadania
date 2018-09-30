package zadanie_5_05_CheckIfBinaryTreeIsBST;

class Runner {
    public static void main(String[] aaa) {
        BST<Integer> tree = new BST<>();

        tree.insert(19);
        tree.insert(20);
        tree.insert(21);
        tree.insert(22);
        tree.insert(23);
        tree.insert(10);

        System.out.println(tree.traverseInOrderWithCheck());
    }
}