package Tree;

public class BuildATreeUsingPreOrder {
	
		private static class Node {
			
			Node left ;
			Node right ;
			int data ;
			
			public Node(int data) {
				this.data = data ;
				this.left = null ;
				this.right = null ;
				
			}
		}
		static class BinaryTree{
			
			static int idx = -1 ;
				
			public static Node buildTree(int nodes []){
				
				idx++ ;
				
				if(idx < nodes.length && idx == -1) return null ;
				
				Node node = new Node(nodes[idx]) ;
				
				node.left = buildTree(nodes) ;
				
				node.right = buildTree(nodes) ;
				
				return node ;
			}
		}

	public static void main(String[] args) {
		
		int arr [] = {1, 2, 4, -4, -1, 5, -1, -1, 3, -3, 6, -1, -1} ;
		
		BinaryTree tree = new BinaryTree() ;
		
		Node node = tree.buildTree(arr) ;
		
		System.out.println(node.data);
		
		
	}
}
