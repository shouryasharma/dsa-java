package datastructures;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(11);
        bst.insert(15);
        bst.insert(9);
        bst.insert(10);
        bst.insert(7);

        System.out.println("Root: " + bst.root.value);

        System.out.println("Root: " + bst.contains(5));
    }
}