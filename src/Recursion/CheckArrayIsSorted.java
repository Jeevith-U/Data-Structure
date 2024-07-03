package Recursion;

import java.text.BreakIterator;

public class CheckArrayIsSorted {
	
	public static void main(String[] args) {
		int arr [] = {1, 3, 4, 7, 9} ;
		checkArray(arr, 0, 0) ;
	}

	public static void checkArray(int[] arr, int idx, int diff) {
		
		if(idx == arr.length-1) {
			System.out.println("Array Is Sorted"); return ;
		}
		else {
			int curdis = arr[idx] - arr[idx+1] ;
			if(idx == 0) diff = curdis ;
			if(diff != curdis) {
				System.out.println("the Array is Not Sorted");
				return ;
			}
			checkArray(arr, idx+1, diff);
		}
		
	}
	
}
