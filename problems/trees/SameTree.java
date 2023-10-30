package trees;

import datastructures.BinarySearchTree;
import datastructures.BinarySearchTree.Node;;

public class SameTree {
    public static boolean isSameTree(Node p, Node q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null || p.value != q.value) {
            System.out.println(p.value + " " + q.value);
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst1 = new BinarySearchTree();
        bst1.rInsert(4);
        bst1.rInsert(2);
        bst1.rInsert(7);

        BinarySearchTree bst2 = new BinarySearchTree();
        bst2.rInsert(4);
        bst2.rInsert(2);
        bst2.rInsert(7);

        BinarySearchTree bst3 = new BinarySearchTree();
        bst3.rInsert(4);
        bst3.rInsert(2);
        bst3.rInsert(6);

        System.out.println(isSameTree(bst1.root, bst2.root));
        System.out.println(isSameTree(bst2.root, bst3.root));
    }
}
