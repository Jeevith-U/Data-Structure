package Tree;

public class HightOfATree {

    public static void main(String[] args) {

        int arr [] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BuildATreeUsingPreOrder.Node headNode = BuildATreeUsingPreOrder.BinaryTree.buildTree(arr);

        int height = findHeight(headNode) ;

        System.out.println("The total Height is : "+height);

    }

    private static int findHeight(BuildATreeUsingPreOrder.Node headNode) {

        if(headNode == null ) return 0 ;

        int leftHeight = findHeight(headNode.left) ;

        int rightHeight = findHeight(headNode.right) ;

        int curHeight = Math.max(leftHeight, rightHeight) + 1 ;

        return curHeight ;
    }
}
