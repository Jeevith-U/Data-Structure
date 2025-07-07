package LinkedList;

public class ImplementingOwnLinkedList2 {
	
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
	
	public Node reversUsingRecursion(Node head) {
		
		if(head == null || head.next == null) return head ;
		
		Node newHead = reversUsingRecursion(head.next) ;
		
		Node headNext = head.next ;
		
		headNext.next = head ;
		
		head.next = null ;
		
		return newHead ;
	}
}
