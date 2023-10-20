package trees;

import javax.swing.tree.TreeNode;

public class LowestCommonAncestor {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return q;
    }

    public static void main(String[] args) {
        System.out.println(lowestCommonAncestor(null, null, null));
    }
}
