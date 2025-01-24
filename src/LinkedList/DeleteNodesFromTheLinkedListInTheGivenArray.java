package LinkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Jeevith
 *
 */

class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	      
}

public class DeleteNodesFromTheLinkedListInTheGivenArray {
	
	public ListNode modifiedList(int[] nums, ListNode head) {

        Set<Integer> set = new HashSet() ;

        for(int i : nums) set.add(i) ;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null) {
            if (set.contains(current.next.val)) {
                current.next = current.next.next; 
            } else {
                current = current.next; 
            }
        }
         return dummy.next ;
    }
}


