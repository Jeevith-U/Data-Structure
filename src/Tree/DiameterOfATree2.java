package Tree;

/*
    - To solve this in lesser time w'll create a class that consist of tree diameter and height.
    - we won't be calculating them separately.
    - the above approach will take O(n)

 */
public class DiameterOfATree2 {

    public static void main(String[] args) {

        int arr [] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BuildATreeUsingPreOrder.Node headNode = BuildATreeUsingPreOrder.BinaryTree.buildTree(arr);

        Treeinfo tree = findTreeInfo(headNode);

        System.out.println("The total Diameter is : "+tree.diameter);
        System.out.println("The total Height is : "+tree.height);
    }

    private static Treeinfo findTreeInfo(BuildATreeUsingPreOrder.Node headNode) {

        if(headNode == null) return new Treeinfo(0, 0) ;

        Treeinfo left = findTreeInfo(headNode.left);

        Treeinfo right = findTreeInfo(headNode.right);

        int myHeight = Math.max(left.height,  right.height) + 1 ;

        int dia1 = left.diameter;
        int dia2 = right.diameter;
        int dia3 = left.height + right.height + 1 ;

        int mydia = Math.max(dia3, Math.max(dia1, dia2)) ;

        Treeinfo myTreeInfo = new Treeinfo(myHeight, mydia) ;

        return  myTreeInfo ;


    }

    static  class  Treeinfo{

        int height ;
        int diameter ;

        public Treeinfo(int height, int diameter ){
            this.height = height ;
            this.diameter = diameter ;
        }
    }
}
