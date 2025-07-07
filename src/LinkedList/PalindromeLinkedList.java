package LinkedList;

/**
 * @author Jeevith
 *
 */

public class PalindromeLinkedList {
	
	public static void main(String[] args) {
		
		ImplementingOwnLinkedList<Character> l = new ImplementingOwnLinkedList<Character>() ;
		
		l.add('M');
		l.add('A');
		l.add('D');
		l.add('A');
		l.add('M');
		
		boolean res = verifyPalindrome(l.head) ;
		
		if(res) System.out.println("The Given LinkedList is a Palindrome");
		
		else System.out.println("The Given LinkedList Is Not a Palindrome");
		
	}

	public static boolean verifyPalindrome(Node head) {
		
		if(head == null || head.next == null) return true ;
		
		Node mid = findMiddle(head) ;
		
		Node last = reverse(mid.next) ;
		
		while (last != null) {
			
			if(last.data != head.data) return false ;
			
			last = last.next ;
			
			head = head.next ;
			
		}
		
		return true ;
		
	}

	public static Node reverse(Node node) {
		
		Node curNode = node ;
		
		Node prevNode = null ;
		
		while (curNode != null) {
			
			Node tempNode = curNode.next ;
			
			curNode.next = prevNode ;
			
			prevNode = curNode ;
			
			curNode = tempNode ;
		}

		return prevNode ;
		
	}

	public static Node findMiddle(Node head) {

		Node fast = head ;
		
		Node slow = head ;
		
		if(fast != null || fast.next != null) {
			
			fast = fast.next.next;
			slow = slow.next ;
		}
		
		return slow;
	}

}


