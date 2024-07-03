package LinkedList;

public class ImplementingOwnLinkedList {
	
	Node head ;
	
	public void add(int n) {
		
		Node node = new Node() ;
		node.data = n ;
		node.node = null ;
		
		if(head == null)
			head = node ;
		else {
			
			Node temp = head ;
			
			while(temp.node != null) {
			
				temp = temp.node ;
			}
			temp.node = node ;
		}
	}
	
	public void show() {
		
		Node node = head ;
		
		while(node.node != null) {
			System.out.println(node.data);
			node = node.node ;
		}
		System.out.println(node.data);
	}
	
	public void insertAt(int position, int data) {
		
		Node node = new Node() ;
		
		node.data = data ;
		
		Node temp = head ;
		
		int count = 0 ;
		
		while(temp.node != null) {
			
			temp = temp.node ;
			count++ ;
			
			if(count == position-2) {
				
				Node nextNode = temp.node ;
				
				temp.node = node ;
				
				node.node = nextNode;
				
			}
		}
	}
	
	public void reverse() {
		
		Node currentNode = head ;
		
		Node previous = null ;
		
		while(currentNode.node != null) {
			
			Node temp = currentNode.node ;
			
			currentNode.node = previous ;
			previous = currentNode ;
			currentNode = temp ;
			
		}
	}
}
