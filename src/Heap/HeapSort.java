package Heap;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Jeevith
 *
 */

public class HeapSort {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(40, 10, 30, 50, 60, 15)) ;
		
		int count = 0 ;
		
		System.out.println("Before Heap : "+arr);
		
		while (count <= arr.size()) {
			buildHeap(arr, arr.size());
			removeHead(arr);
		}
		
		System.out.println("After Heap : "+arr);
	}

	public static void buildHeap(ArrayList<Integer> arr, int length) {
		/**
		 * Leave the leaf node build it above from the leaf node 
		 */
		for(int i = (arr.size()/2) - 1 ; i >= 0 ; i-- ) {
			
			createHeap(arr, length, i) ;
		}
	}

	public static void createHeap(ArrayList<Integer> arr, int length, int i) {
		
		int left = 2 * i ;
		int right = 2 * i + 1 ;
		int large = i ;
		
		if(left < length && arr.get(left) > arr.get(large)) large = left ;
		
		if(right < length && arr.get(right) > arr.get(large)) large = right ;
		
		if(large != i) {
			
			int temp = arr.get(large) ;
			arr.set(large, arr.get(i)) ;
			arr.set(i, temp);
			
			createHeap(arr, length, large);
		}
	}
	
	public static void removeHead(ArrayList<Integer> arr) {
		
		if(arr.size() == 0) return ;
		
		System.out.print(arr.get(0)+" ");
		
		arr.set(0, arr.get(arr.size()-1)) ;
		
		arr.remove(arr.size()-1) ;
		
	}
}


