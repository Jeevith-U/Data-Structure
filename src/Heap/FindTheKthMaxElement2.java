package Heap;

import java.util.PriorityQueue;

/**
 * In the given integer array find the Kth max element
 * if k = 3 find <h3>3rd</h3> max Element
 * int arr [] = {20, 10, 60, 30, 50, 40} after using priorityQueue {10, 20, 30, 40, 50, 60}
 * <h1>priorityQueue</h1> internally uses the min heap 
 *
 */

public class FindTheKthMaxElement2 {
	
	public static void main(String[] args) {
		
		int arr [] = {20, 10, 60, 30, 50, 40} ;
		
		int k = 2 ;
		
		findTheKthMax(arr, k) ;
		
	}

	public static void findTheKthMax(int[] arr, int k) {
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>() ;
		
		for (int i = 0; i < k; i++) q.add(arr[i]) ;
		
		
		for(int i = k ; i < arr.length ; i++) {
			
			if(q.peek() < arr[i]) {
				q.poll() ;
				q.add(arr[i]) ;
			}
			
		}
		
		
		
		System.out.println(q.peek());
	}
}


