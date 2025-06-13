package LinkedList;

public class LinkedListDriver {
	
	public static void main(String[] args) {
		
		ImplementingOwnLinkedList ll = new ImplementingOwnLinkedList() ;
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(80);
		
		ll.reverse();
		
		ll.show();
	}
}
