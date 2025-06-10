package Heap;

import java.util.Arrays;

/**
 * @author Jeevith
 * We need to heapfy excluding the leaf node
 * we are returning the head node or any form of node w'll return array 
 */

public class Custome_Min_Heap {
	
	public static void createHeap(int arr [], int length, int idx) {
		
		int largest = idx;

		int left = 2 * idx;

		int right = 2 * idx + 1;

		if (left < length && arr[left] < arr[largest])
			largest = left;

		if (right < length && arr[right] < arr[largest])
			largest = right;

		if (largest != idx) {
			int temp = arr[largest];
			arr[largest] = arr[idx];
			arr[idx] = temp;
			createHeap(arr, length, largest);
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr []  = {3, 9, 2, 1, 4, 5 } ;
		
		System.out.println("Before Heap Sort : "+Arrays.toString(arr));
		
		heap(arr) ;
		
		System.out.println("After Heap Sort : "+Arrays.toString(arr));
	}

	/**
	 * The leaf node are already balanced or heapyfied
	 * 
	 */
	public static int[] heap(int[] arr) {
		
		for (int i = (arr.length/2)-1 ; i >= 0; i--) {
			
			createHeap(arr, arr.length, i) ;
		}
		
		return arr ;
	}
}


