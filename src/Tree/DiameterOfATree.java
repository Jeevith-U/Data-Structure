package Tree;

/*
    - there are two possible ways of this problem they are
    - i) Diameter passing through the root
    - ii) Diameter without passing through the root
    - there is another scenario that needed to be considered in case ( ii )
    - that the max diameter may present in left sub tree or right sub tree or including root ie. leftmaxsubtree + rightmaxsubtree + 1
    - the above approach will take O(n2)

 */
public class DiameterOfATree {

    public static void main(String[] args) {

        int arr [] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BuildATreeUsingPreOrder.Node headNode = BuildATreeUsingPreOrder.BinaryTree.buildTree(arr);

        int dia = calculateDiameter(headNode) ;

        System.out.println("The total Diameter is : "+dia);
    }

    private static int findHeight(BuildATreeUsingPreOrder.Node headNode) {

        if(headNode == null ) return 0 ;

        int leftHeight = findHeight(headNode.left) ;

        int rightHeight = findHeight(headNode.right) ;

        int curHeight = Math.max(leftHeight, rightHeight) + 1 ;

        return curHeight ;
    }

    private static int calculateDiameter(BuildATreeUsingPreOrder.Node headNode) {

        if(headNode == null) return 0 ;

        int leftDia = calculateDiameter(headNode.left) ;

        int rightDia = calculateDiameter(headNode.right) ;

        int totDia = findHeight(headNode.left) + findHeight(headNode.right) + 1 ;

        return  Math.max(totDia, Math.max(leftDia, rightDia)) ;
    }
}
