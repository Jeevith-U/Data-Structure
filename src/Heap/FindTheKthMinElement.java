package Heap;

import java.util.PriorityQueue;

/**
 * In the given integer array find the Kth min element
 * if k = 3 find <h3>3rd</h3> min Element
 * int arr [] = {20, 10, 60, 30, 50, 40} after using priorityQueue {10, 20, 30, 40, 50, 60}
 * <h1>priorityQueue</h1> internally uses the min heap 
 *
 */

public class FindTheKthMinElement {
	
	public static void main(String[] args) {
		
		int arr [] = {20, 10, 60, 30, 50, 40} ;
		
		int k = 3 ;
		
		findTheKthMin(arr, k) ;
		
	}

	public static void findTheKthMin(int[] arr, int k) {
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>() ;
		
		for (int num : arr) {
            q.add(num);

            if (q.size() > k) {
                q.poll(); // remove the largest
            }
        }
		System.out.println(q.peek());
	}
}


