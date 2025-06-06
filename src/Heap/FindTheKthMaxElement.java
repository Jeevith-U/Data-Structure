package Heap;

import java.util.PriorityQueue;

/**
 * In the given integer array find the Kth max element
 * if k = 3 find <h3>3rd</h3> max Element
 * int arr [] = {20, 10, 60, 30, 50, 40} after using priorityQueue {10, 20, 30, 40, 50, 60}
 * <h1>priorityQueue</h1> internally uses the min heap 
 *
 */

public class FindTheKthMaxElement {
	
	public static void main(String[] args) {
		
		int arr [] = {20, 10, 60, 30, 50, 40} ;
		
		int k = 2 ;
		
		findTheKthMax(arr, k) ; 
		
	}
 
	/**
	 * In the following logic I'm adding the elements to the priority queue. 
	 * Inside the priority queue elements will be arranged in the descending order using Max Min Heep.
	 * When I reach maximum number of elements inside the heap is equals to the K th element. I will remove them by doing this at the end I will have only three elements. in the queue.   
	 * Since I'm using mainly. the three large element will be in the heap will return the top. 1 
	 * @param arr
	 * @param k
	 */
	public static void findTheKthMax(int[] arr, int k) {
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>() ;
		
		for(int i : arr) {
			q.add(i) ;
			
			if(q.size() > k) q.poll() ;
		}
		
		System.out.println(q.peek());
	}
}


