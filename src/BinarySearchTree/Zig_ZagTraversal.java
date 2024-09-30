package BinarySearchTree;

/*

    Zig Zag Traversal in this we traverse on a tree in a zig zag manner

    ----->
    <-----
    ----->
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Zig_ZagTraversal {

    public static void main(String[] args) {

        int arr [] = {8, 5, 6, 2, 1, 3, 14, 10, 15, 16} ;

        BST.Node  root = null;

        for (int j : arr) {

            BST.createBST(root, j);
        }

         printZig_Zag(root) ;

    }

    private static void printZig_Zag(BST.Node root) {

        if(root == null) return  ;

        Stack<BST.Node> curLevel= new Stack<BST.Node>() ;

        Stack<BST.Node> resultLevel = new Stack<BST.Node>() ;

        curLevel.push(root) ;

        boolean flag = false ;

        while (!curLevel.isEmpty()){

            BST.Node node = curLevel.pop();

            System.out.println(node.data);

            if (flag){

                if(root.left != null) curLevel.push(root.left) ;

                if(root.right != null) curLevel.push(root.right) ;
            } else {

                if(root.right != null) curLevel.push(root.right) ;

                if(root.left != null) curLevel.push(root.left) ;

            }

            if (curLevel.isEmpty()){

                Stack<BST.Node> temp = curLevel ;

                curLevel = resultLevel;

                resultLevel = temp ;

                flag = !flag ;

            }

        }
    }
}
