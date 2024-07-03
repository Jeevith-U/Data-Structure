package Tree;

import java.util.Scanner;

public class ImplementingTree {
	
	static Scanner scanner = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		
		Node root = createNode() ;
		
		System.out.println(root);
	}
	
	public static Node createNode(){
		
		Node root = new Node()  ;
		System.out.println("Enter the Element");
	    int data = scanner.nextInt() ;
	    
	    if(data == -1) return null ;
	    
	    root.data = data ;
	    
	    System.out.println("Enter the Left Node for : "+data);
	    root.left = createNode() ;
	    System.out.println("Enter the Right Node for : "+data);
	    root.right = createNode() ;
	    
		return root ;
		
	}
}

class Node<t>{
	
	Node left, right ;
	t data ;
	
}
