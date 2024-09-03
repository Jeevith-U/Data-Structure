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

        inOrderTraversal(root) ;

        deleteNode(root, 5) ;

        inOrderTraversal(root) ;
    }

    public static BST.Node deleteNode(BST.Node root, int val){

        if(val < root.data)  root.left = deleteNode(root.left, val) ;

        else root.right = deleteNode(root.right, val) ;

        else{ // root.data == val

            // case -1 if it is a leaf node

            if(root.left == null && root.right == null ) return null ;

            // case - 2 if we have only one child
            if(root.left == null) return root.right ;

            if(root.right == null) return root.left ;

            // case - 3 if it has 2 children

            BST.Node inordersuccssor = inOrderTraversal(root.right) ;
            root.data = inordersuccssor.data ;
           root.right =  deleteNode(root.right, inordersuccssor.data) ;


        }
    }

    public static  BST.Node inOrderTraversal(BST.Node root){

        while (root != null){

            root = root.left ;
        }

        return root ;
    }
}
