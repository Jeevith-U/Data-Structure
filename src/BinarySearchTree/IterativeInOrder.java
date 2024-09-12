package BinarySearchTree;

import java.util.ArrayList;
import java.util.Stack;

/*
    - we Have to perform pre-order i.e node, left, right but in iterative form not using recursion
    - I will use stack to do this
    - when i visit a node i will add node first and i will add right and left node to stack 
    - i will print the current node and i will pop it up and add right and left 
 */
public class IterativeInOrder {

    public static void main(String[] args) {

        int arr[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        BST.Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = BST.createBST(root, arr[i]);
        }

        ArrayList<Integer> result = inOrder(root);

        System.out.println(result);
        
    }

    private static ArrayList<Integer> inOrder(BST.Node root) {

        Stack <BST.Node> stack = new Stack<BST.Node>() ;

        ArrayList<Integer> list = new ArrayList<Integer>() ;

        stack.add(root)  ;

        if (root == null) return list;

        while (true){

            if(root != null){
                stack.add(root) ;
                root = root.left ;
            }else {
                if(stack.isEmpty()) break ;

                root = stack.pop() ;
                list.add(root.data) ;
                root = root.right ;

            }



        }

        return list ;
     }
}
