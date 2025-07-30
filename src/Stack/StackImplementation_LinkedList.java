package Stack;

/**
 *
 */

class StackNode {
	
	int data ;
	StackNode next ;
}

public class StackImplementation_LinkedList {
	
	StackNode head ;
	int size ;
	
	public StackImplementation_LinkedList() {
		
		head = null ;
		
		size = 0 ;
	}
	
	public void push(int data) {
		
		StackNode temp = new StackNode() ;
		temp.data = data ;
		temp.next = head ;
		head = temp ;
		size++ ;
	}
	
	public int peek() {
		
		if(head == null)throw new RuntimeException("Stack is Empty");
		
		else return head.data ;
	}
	
	public int pop() {
		
		if(head == null) throw new RuntimeException("Stack is Empty can't retrive the value.");
		
		else {
			size-- ;
			int data = head.data ;
			head = head.next ;
			return data ;
		}
	}
	
}


