package Heap;

import java.util.PriorityQueue;

/**
 * An Array Will be given with length of the rope
 * we have to add the ropes 
 * the cost of the ropes will the sum of length of the ropes
 * we have to add all the ropes in the array and cost should be minimum
 * int arr [] = [2, 5, 4, 8, 6, 9] sum = (2 + 4) = 6 
 * [6, 5, 8, 6, 9] sum = 6 + (5 + 6) 
 * [11, 8, 6, 9] sum = 6 + 11 + (6 + 8)
 * [11, 14, 9] sum = 6 + 11 + 14 + (11 + 9)
 * [20, 14] sum = 6 + 11 + 14 + 20 + 34
 * sum = 84 minimum cost 
 */

public class Connect_N_RopeWith_Min_Cost {
	
	public static void main(String[] args) {
		
		int arr [] = {2, 5, 4, 8, 6, 9} ;
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>() ;
		
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


