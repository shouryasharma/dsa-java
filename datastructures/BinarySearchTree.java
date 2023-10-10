package datastructures;

public class BinarySearchTree {
    public Node root;

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    // iterative insert
    public boolean insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;

        while (true) {
            if (newNode.value == temp.value)
                return false;

            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    // recursive insert
    private Node rInsert(Node currentNode, int value) {
        if (currentNode == null)
            return new Node(value);
        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else if (value > currentNode.value) { // try to replace with else
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

    public void rInsert(int value) {
        if (root == null)
            root = new Node(value);
        rInsert(root, value);
    }

    // iterative contains
    public boolean contains(int value) {
        Node temp = root;
        while (temp != null) {
            if (value < temp.value)
                temp = temp.left;
            else if (value > temp.value)
                temp = temp.right;
            else
                return true;

        }
        return false;
    }

    // recursive contains
    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null)
            return false;
        if (value == currentNode.value)
            return true;
        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.left, value);
        }
    }

    public boolean rContains(int value) {
        return rContains(root, value);
    }

    // dfsPreOrder Traversal
    public void dfsPreOrder(Node node) {
        if (node != null) {
            System.out.println(node.value);
            dfsPreOrder(node.left);
            dfsPreOrder(node.right);
        }
    }
}