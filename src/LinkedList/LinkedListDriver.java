package LinkedList;

public class LinkedListDriver {
	
	public static void main(String[] args) {
		
		ImplementingOwnLinkedList ll = new ImplementingOwnLinkedList() ;
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
//		System.out.println("Before Insertion : ");
//		ll.show() ;
		
//		ll.insertAt(3, 50);
		System.out.println();
		ll.show();
		
		ll.reverse();
		
	}
}
