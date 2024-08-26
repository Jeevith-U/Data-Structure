package Tree;

public class BuildATreeUsingPreOrder {

	   public static class Node {
		Node left;
		Node right;
		int data;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class BinaryTree {

		static int idx = -1;

		public static Node buildTree(int nodes[]) {

			idx++;

			// Base condition: return null for -1 and out of bounds index
			if (idx >= nodes.length || nodes[idx] == -1) {
				return null;
			}

			// Create the node
			Node node = new Node(nodes[idx]);

			// Recursively build the left and right subtrees
			node.left = buildTree(nodes);
			node.right = buildTree(nodes);

			return node;
		}
	}

	public static void main(String[] args) {

		int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

		BinaryTree tree = new BinaryTree();

		Node root = tree.buildTree(arr);

		// Printing the root data to verify the tree is built
		System.out.println("Root node data: " + root.data);
	}
}
