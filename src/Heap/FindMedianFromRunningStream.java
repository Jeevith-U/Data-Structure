package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Problem: Find the Median from a Running Stream of Integers
 *
 * Approach:
 * - We use two Heaps (Priority Queues):
 *     1. maxHeap (left side): stores the smaller half of the numbers
 *     2. minHeap (right side): stores the larger half of the numbers
 *
 * - maxHeap is a Max-Heap, i.e., the largest number among the smaller half is at the top.
 * - minHeap is a Min-Heap, i.e., the smallest number among the larger half is at the top.
 *
 * Insertion Strategy:
 * - Insert the number into maxHeap if it's less than or equal to the top of maxHeap.
 * - Otherwise, insert it into minHeap.
 *
 * Balancing:
 * - Ensure the maxHeap size is never more than one greater than minHeap.
 * - If the size difference breaks the rule, balance by moving the top element.
 *
 * Median Calculation:
 * - If both heaps have the same size: median = average of tops.
 * - If maxHeap has more elements: median = top of maxHeap.
 *
 * This allows O(log n) insertion and O(1) median retrieval.
 */

public class FindMedianFromRunningStream {
	
	
	PriorityQueue<Integer> maxHeap ;
	PriorityQueue<Integer> minHeap ;
	
	public FindMedianFromRunningStream() {
		this.maxHeap = new PriorityQueue<Integer>((a, b) -> b - a) ; // max heap || Collections.reverseOrder() ;
		this.minHeap = new PriorityQueue<Integer>((a, b) -> a - b) ; // min heap
	}
	
	public void insertNum(int num) {
		
		if(maxHeap.isEmpty() || maxHeap.peek() >= num) maxHeap.add(num) ;
		
		else minHeap.add(num) ;
		
		if(maxHeap.size() > minHeap.size()+1) minHeap.add(maxHeap.poll()) ;
		
		else if(maxHeap.size() < minHeap.size()) maxHeap.add(minHeap.poll()) ;
	}
	
	public double findMedian() {
		
		if(maxHeap.size() == minHeap.size()) 
			return (maxHeap.peek()/2.0) + (minHeap.peek()/2.0) ;
		
		else return maxHeap.peek() ;
	}
	
	
	public static void main(String[] args) {
		
		FindMedianFromRunningStream mos = new FindMedianFromRunningStream() ;
		
		mos.insertNum(3);
		mos.insertNum(1);
		System.out.println(mos.findMedian());
		mos.insertNum(5);
		System.out.println(mos.findMedian());
	}
}


