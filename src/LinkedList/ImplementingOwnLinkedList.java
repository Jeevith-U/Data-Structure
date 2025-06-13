package LinkedList;

public class ImplementingOwnLinkedList {
	
	Node head ;
	
	public void add(int n) {
		
		Node node = new Node() ;
		node.data = n ;
		node.next = null ;
		
		if(head == null)
			head = node ;
		else {
			
			Node temp = head ;
			
			while(temp.next != null) {
			
				temp = temp.next ;
			}
			temp.next = node ;
		}
	}
	
	public void show() {
		
		Node node = head ;
		
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next ;
		}
		System.out.println(node.data);
	}
	
	public void insertAt(int position, int data) {
		
		Node node = new Node() ;
		
		node.data = data ;
		
		Node temp = head ;
		
		int count = 0 ;
		
		while(temp.next != null) {
			
			temp = temp.next ;
			count++ ;
			
			if(count == position-2) {
				
				Node nextNode = temp.next ;
				
				temp.next = node ;
				
				node.next = nextNode;
				
			}
		}
	}
	
	public void reverse() {
		
		Node currentNode = head ;
		
		Node previous = null ;
		
		while(currentNode!= null) {
			
			Node temp = currentNode.next ;
			
			currentNode.next = previous ;
			previous = currentNode ;
			currentNode = temp ;
		}
		
		head = previous ;
	}
}
