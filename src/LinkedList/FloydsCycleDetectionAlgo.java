package LinkedList;

/**
 * in the given linked list we have to check whether there's a clyclic reference is present 
 *
 */

public class FloydsCycleDetectionAlgo {
	
	public static void main(String[] args) {
		
		ImplementingOwnLinkedList<Integer> l = new ImplementingOwnLinkedList<Integer>() ;
		
		detectTheCycleStart(l.head) ;
	}

	/**
	 * To find the starting point of loop
	 */
	public static Node detectTheCycleStart(Node head) {
		
		Node meet = detectCycle(head) ;
		
		Node start = head ;
		
		if(start != meet) {
			start = start.next ;
			meet = meet.next ;
		}
		return start ;
		
	}

	/**
	 * to find the whether do we have a cycle of not
	 */
	public static Node detectCycle(Node head) {
		
		Node fast = head ;
		
		Node slow = head ;
		
		if(fast != null && fast.next != null) {
			
			fast = fast.next ;
			
			slow = slow.next ;
			
			if(fast == slow) return slow ;
		}
		
		return null;
	}
}


