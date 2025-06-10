package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * An Array Will be given with length of the rope
 * we have to add the ropes 
 * the cost of the ropes will the sum of length of the ropes
 * we have to add all the ropes in the array and cost should be minimum
 * Max-heap = {9, 8, 6, 5, 4, 2}
 * Combine 9 + 8 = 17 → total = 17 → add 17 to heap
 * Combine 17 + 6 = 23 → total = 40 → add 23
 * Combine 23 + 5 = 28 → total = 68 → add 28
 * Combine 28 + 4 = 32 → total = 100 → add 32
 * Combine 32 + 2 = 34 → total = 134 
 */

public class Connect_N_RopeWith_Max_Cost {
	
	public static void main(String[] args) {
		
		int arr [] = {2, 5, 4, 8, 6, 9} ;
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder()) ;
		
		for(Integer i : arr) q.add(i) ;
		
		findMinimumCost(q) ;
		
	}

	public static void findMinimumCost(PriorityQueue<Integer> q) {
		
		int sum = 0 ;
		
		while (q.size() > 1) {
			
			int firstValue = q.poll(), secondValue = q.poll() ;
			
			int cost = firstValue + secondValue ;
			
			sum += cost ;
			
			q.add(cost) ;
		}
		
		System.out.println(sum);
	}
}


