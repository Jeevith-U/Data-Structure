package LinkedList;

public class ImplementingDoubleLinkedList {
	
	DoubleNode head ;
	
	public void insert(int data) {
		
		DoubleNode node = new DoubleNode() ;
		node.data = data ;
		
		if(head == null ) head = node ;
		else {
			
			DoubleNode temp = head ;
			
			while(temp.next != null) {
				temp = temp.next ;
			}
			temp.next = node ;
			node.previous = temp ;
		}
	}
	
	public void insertAtBegining(int data) {
		
		DoubleNode node = new DoubleNode() ;
		node.data = data ;
		
		DoubleNode temp = head ;
		
		head = node ;
		head.next = temp ;
		temp.previous = head ;
	   
	}
	
	public void show() {
		
		DoubleNode node = head ;
		
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next ;
		}
		System.out.println(node.data);
	}
	
	public void insertAt(int data, int index) {
		
		DoubleNode node = new DoubleNode();

		node.data = data;

		int count = 0;
		if (index == 0)
			insertAtBegining(data);
		else {

			DoubleNode temp = head;

			while (temp.next != null) {

				temp = temp.next;
				count++;

				if (count == index - 2) {

					DoubleNode nextNode = temp.next;

					temp.next = node;
					node.previous = temp;
					node.next = nextNode;
				}
			}

		}

	}
	
}
