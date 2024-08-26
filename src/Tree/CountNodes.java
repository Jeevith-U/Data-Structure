package Tree;

/*
    - In this program we have to count number of nodes in a given tree
    - from head node we have to take all sub tree of left side and
      all sub tree of right side + 1 will be the total number of node and we have to repeat this

 */
public class CountNodes {

    public static void main(String[] args) {

        int arr [] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BuildATreeUsingPreOrder.Node headNode = BuildATreeUsingPreOrder.BinaryTree.buildTree(arr);

        int nodeCount = countNodes(headNode) ;

        System.out.println("The Number of Nodes Is : "+nodeCount);
    }

    public static int countNodes(BuildATreeUsingPreOrder.Node headNode) {

        if(headNode == null) return 0 ;

        int leftNode = countNodes(headNode.left) ;
        int rightNode = countNodes(headNode.right) ;

        return leftNode + rightNode + 1 ;

    }
}
