package datastructures;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.rInsert(11);
        bst.rInsert(15);
        bst.rInsert(9);
        bst.rInsert(10);
        bst.rInsert(7);

        System.out.println("Root: " + bst.root.value);

        System.out.println("Root: " + bst.contains(5));
        System.out.println("Root: " + bst.rContains(7));
        System.out.println("Root: " + bst.rContains(5));

        System.out.println("dfsPreOrder:");
        bst.dfsPreOrder(bst.root);
    }
}