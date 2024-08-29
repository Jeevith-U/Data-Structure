package BinarySearchTree;

public class BST {

    static class Node{
        int data ;
        Node left ;
        Node right ;

        public Node(int data){
            this.data = data ;
        }
    }

    public static Node createBST(Node root, int data){

        if(root == null){
            root = new Node(data) ;
            return root ;
        }

        if (data < root.data) root.left = createBST(root.left, data) ;

        else  root.right = createBST(root.right, data) ;

        return root ;
    }
}
