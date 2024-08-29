package Tree;

import java.util.LinkedList;
import java.util.Queue;

/*
   - Added Root Node and null to queue
   - Now Print the root node data before that add left node(l1) and right node (r1) of it to the queue
   - when ever you see null go to the next line
   - take l1 & add left & right node if it to queue and print l1
   - take r1 & add left & right node if it to queue and print r1
   - Time complexity of LevelOrderTraversal Is O(n)

 */
public class LevelOrderTraversalOnATree {

    public static void main(String[] args) {

        BuildATreeUsingPreOrder tree = new BuildATreeUsingPreOrder() ;

        int arr [] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        var rootNode =BuildATreeUsingPreOrder.BinaryTree.buildTree(arr) ;

        printLevelOrder(null) ;

    }

    public static void printLevelOrder(BuildATreeUsingPreOrder.Node rootNode) {

        Queue<BuildATreeUsingPreOrder.Node> q = new LinkedList<>() ;

        q.add(rootNode) ;
        q.add(null) ;

        while(!q.isEmpty()){

            BuildATreeUsingPreOrder.Node node = q.remove();

            if(node == null){ // insted of that we can check with -1
                System.out.println();
                if (q.isEmpty()) break;
                else q.add(null) ;
            }else {
                System.out.print(node.data+" ");
                if(node.left != null) q.add(node.left) ;
                if(node.right != null) q.add(node.right) ;
            }
        }
    }
}


