package BinarySearchTree;

public class SearchBSTTree {

    public static void main(String[] args) {

        int arr [] = {8, 5, 3, 1, 4, 6, 10, 11, 14} ;

        BST.Node root = null ;

        for (int i = 0; i < arr.length; i++) {
            root = BST.createBST(root, arr[i]) ;
        }

        boolean flag = findKey(root, 61);

        if (flag) System.out.println("The Element is present in the Tree");

        else System.out.println("Element is Not Present in the Tree");
    }

    public static boolean findKey(BST.Node root, int key) {

        if(root == null) return false;

        if (root.data == key) return true ;

        return (key < root.data) ? findKey(root.left, key) : findKey(root.right, key) ;
    }
}
