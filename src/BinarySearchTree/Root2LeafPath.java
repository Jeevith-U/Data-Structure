package BinarySearchTree;

import java.util.ArrayList;

/*
    - In this program we have to count how many ways are there to navigate to a leaf from the root
    - To solve this program, we will use a ArrayList
    - We will travel up to the leaf, adding the element to the array list when we are in the leaf node, we will print all the element in the Array list.
       And we will go back to the parent node of the leaf node and remove the leaf node from the real list.
    - To solve this problem, we will use the property of preorder, which is node left, right
    - Once we have reached the leaf node, we have to print our list, and we have to traverse back to the parent node by removing the late node from the array list.
 */
public class Root2LeafPath {

    public static void main(String[] args) {

        int arr[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        BST.Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = BST.createBST(root, arr[i]);
        }

        printLeafNode(root, new ArrayList<Integer>() ) ;
    }

    private static void printLeafNode(BST.Node root, ArrayList<Integer> path) {

        if(root == null) return ;

        path.add(root.data) ;

        if (root.left == null && root.right ==null) printPath(path) ;

        else {
            printLeafNode(root.left, path);
            printLeafNode(root.right, path);
        }

        path.remove(path.size()-1) ;
    }

    private static void printPath(ArrayList<Integer> path) {
        path.stream().forEach(i -> System.out.print(i+" "));
        System.out.println();

    }

}
