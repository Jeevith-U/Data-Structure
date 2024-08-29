package BinarySearchTree;

public class PrintBST {

    public static void main(String[] args) {

        int arr [] = {5, 1, 3, 4, 2, 7} ;

        BST.Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = BST.createBST(root, arr[i]);
        }

        inOrder(root) ;
    }

    private static void inOrder(BST.Node root) {

       if(root == null) return  ;

       inOrder(root.left) ;
       System.out.println(root.data);
       inOrder(root.right) ;
    }
}
