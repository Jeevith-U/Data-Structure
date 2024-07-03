package LinkedList;

public class DoubleLinkedListDriver {
	
	public static void main(String[] args) {
		
		ImplementingDoubleLinkedList ll = new ImplementingDoubleLinkedList() ;
		
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		
		ll.show();
		System.out.println();
		
//		ll.insertAtBegining(190);
		
		ll.show();
		System.out.println();
		
		ll.insertAt(69, 3);
		ll.show();
		
		System.out.println();
	}
}
