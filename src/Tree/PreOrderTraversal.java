package Tree;

import Tree.BuildATreeUsingPreOrder.Node;

/**
 * @author Jeevith
 */

public class PreOrderTraversal {
	
	public static void main(String[] args) {
		
		int arr [] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1} ;
		
		Tree.BuildATreeUsingPreOrder.Node node = BuildATreeUsingPreOrder.BinaryTree.buildTree(arr) ;
		
		System.out.println("Preorder Traversal:");
		preOrderTraversal(node) ;
		
		System.out.println("\nInorder Traversal:");
		inOrder(node) ;
		
		System.out.println("\nPostorder Traversal:");
		postOrder(node) ;
	}

	private static void postOrder(Node node) {
		if (node == null) return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.data);
	}

	private static void inOrder(Node node) {
		if (node == null) return;
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
	}

	private static void preOrderTraversal(Node node) {
		if (node == null) return;
		System.out.println(node.data);
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}
}
