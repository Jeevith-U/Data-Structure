package BinarySearchTree;

/*
    - In this program we will be given with two values we have to print all the values which lies in between those two values
    - both the values are inclusive
    - lets assume they have given two values called as x & y
    - x < root < y in this scenario values will be present in left and right subtree
    - x > root in this scenario all the values will be present at right sub tree
    - root > y or ( y < root ) in this scenario all the values will be present at left subtree
 */
public class PrintRange {

    public static void main(String[] args) {

        int arr[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        BST.Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = BST.createBST(root, arr[i]);
        }

        printValuesInRange(root, 8, 14) ;
    }

    private static void printValuesInRange(BST.Node root, int x, int y) {

        if(root == null) return ;

        if(x <= root.data && y >= root.data){

            printValuesInRange(root.left, x, y);
            System.out.print(root.data+" ");
            printValuesInRange(root.right, x, y);
        }
        else if (x > root.data) printValuesInRange(root.right, x, y);

        else printValuesInRange(root.left, x, y);
    }
}
