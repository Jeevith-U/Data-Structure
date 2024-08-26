package Tree;

/*
    - In this program we have to sum number of nodes in a given tree
    - from head node we have to take all value left side sub tree of and
      all value of right side sub tree of  + current node data will be the total number of node and we have to repeat this
 */

public class SumOfNode {

    public static void main(String[] args) {

        int arr [] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BuildATreeUsingPreOrder.Node headNode = BuildATreeUsingPreOrder.BinaryTree.buildTree(arr);

        int sum = CountSum(headNode) ;

        System.out.println("The total sum is : "+sum);
    }

    public static int CountSum(BuildATreeUsingPreOrder.Node headNode) {

        if(headNode == null) return 0 ;
        
        int leftsum = CountSum(headNode.left) ;
        int rightSum = CountSum(headNode.right) ;
        
       return  leftsum +rightSum + headNode.data;
        
    }


}


