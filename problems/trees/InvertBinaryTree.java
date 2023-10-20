package trees;

import datastructures.BinarySearchTree;
import datastructures.BinarySearchTree.Node;

// https://leetcode.com/problems/invert-binary-tree/description/
public class InvertBinaryTree {
    public static Node invertTree(Node root) {
        if (root != null) {
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;

            System.out.println(root.value);

            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.rInsert(4);
        bst.rInsert(2);
        bst.rInsert(7);
        bst.rInsert(1);
        bst.rInsert(3);
        bst.rInsert(6);
        bst.rInsert(9);

        invertTree(bst.root);
    }
}