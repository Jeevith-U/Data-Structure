package Algos;

import java.util.Arrays;

/**
 * @author Jeevith
 *
 */

/*
 * Time worst Complexity O(n2) Average time complexity O(nlogn) for this logic
 * the worst time complexity is when the array is already sorted
 */
public class QuickSort {

	public static void main(String[] args) {

		int arr[] = { 22, 46, 12, 67, 37 };

		quckSort(arr, 0, arr.length - 1);
		
		System.out.println(Arrays.toString(arr));
	}

	public static void quckSort(int[] arr, int low, int high) {

		if (low < high) {

			int piIdx = partition(arr, low, high);

			quckSort(arr, low, piIdx - 1);

			quckSort(arr, piIdx + 1, high);
		}
	}

	public static int partition(int[] arr, int low, int high) {
		
		int pivot = arr[high] ;
		
		int i = low -1 ;
		
		for(int j = low ; j < high ; j++) {
			
			if(arr[j] < pivot) {
				i++ ;
				int temp = arr[i] ;
				arr[i] = arr[j] ;
				arr[j] = temp ;
			}
		}
		
		i++ ;
			
		int temp = arr[i] ;
		arr[i] = arr[high] ;
		arr[high] = temp ;
		
		return i ;
	}
}
