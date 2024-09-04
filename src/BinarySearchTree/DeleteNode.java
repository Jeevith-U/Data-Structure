package BinarySearchTree;

/*
    - There are three cases that we have to keep in mind while writing the program
    - Deleting the leaf node (No Risk Just Delete It)
    - Node which have one child (It can be left child or right child)
    - Node which have both child
    - We have to delete that one particular node not any child of it. child nodes of the deleted node should be connected to the parent node
      of the deleted node
    - the deleted node should be replaced with the inorder successor
    - we will get successor node on two conditions one is at leaf node another one to the right side of the current node

 */

public class DeleteNode {

    public static void main(String[] args) {

        int arr[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        BST.Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = BST.createBST(root, arr[i]);
        }

        inOrderTraversal(root);
        System.out.println();

        root = deleteNode(root, 5);

        inOrderTraversal(root);
    }

    public static BST.Node deleteNode(BST.Node root, int val) {
        if (root == null) return null;

        // Recur down the tree
        if (val < root.data)  root.left = deleteNode(root.left, val);

        else if (val > root.data) root.right = deleteNode(root.right, val);
         else { // root.data == val, this is the node to be deleted

            // Case 1: Node has no children (leaf node)
            if (root.left == null && root.right == null) return null;

            // Case 2: Node has only one child
            if (root.left == null) return root.right;

            else if (root.right == null) return root.left;


            // Case 3: Node has two children
            // Find the in-order successor (smallest in the right subtree)
            BST.Node inOrderSuccessor = findInOrderSuccessor(root.right);

            // Copy the in-order successor's content to this node
            root.data = inOrderSuccessor.data;

            // Delete the in-order successor
            root.right = deleteNode(root.right, inOrderSuccessor.data);
        }
        return root;
    }

    // Method to find the in-order successor (smallest node in the right subtree)
    public static BST.Node findInOrderSuccessor(BST.Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // In-order traversal of the BST
    public static void inOrderTraversal(BST.Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
}
