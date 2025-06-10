package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 *
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


