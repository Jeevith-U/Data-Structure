package Algos;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		
		int arr [] = {8, 6, 2, 5, 1} ;
		
		System.out.println(Arrays.toString(divide(arr, 0, arr.length-1) ));
	}

	public static int[] divide(int[] arr, int start, int end) {
		
		if(start < end) {
			
		int mid = start+(end - start)/2 ;
		
		 int[] leftArray = divide(arr, start, mid);
		 
         int[] rightArray = divide(arr, mid + 1, end);
		
		return  mergeArray(leftArray, rightArray) ;
		}
		return new int [] {arr[start]};
		
	}

	public static int[] mergeArray(int[] leftArray, int[] rightArray) {
		
		int i = 0, j = 0, k = 0 ;
		
		int []mergedArray = new int [leftArray.length+rightArray.length] ;
		
		while (i <leftArray.length && j < rightArray.length) {
			
			if (leftArray[i] < rightArray[j]) {
				
				mergedArray[k] = leftArray[i] ;
				i++ ;
				k++ ;
			}
			else {
				mergedArray[k] = rightArray[j] ;
				j++ ;
				k++ ;
			}
		}
		
		while (i < leftArray.length) {
			
			mergedArray[k] = leftArray[i] ;
			i++ ;
			k++ ;
		}
		
		while (j < rightArray.length) {
			
			mergedArray[k] = rightArray[j] ;
			j++ ;
			k++ ;
			
		}
		
		return mergedArray;
	}
}
