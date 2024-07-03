package Recursion;

import java.util.Arrays;

public class SortArrayUsingRecursion {
	
	public static void main(String[] args) {
		
		int arr [] = {22, 49, 87, 73, 19 } ;
		
		System.out.println(Arrays.toString(sortArray(arr, 0, 1)));
	}

	private static int [] sortArray(int[] arr, int start, int next) {
		
		if(start < arr.length-1) {
			if(next < arr.length) {
				if(arr[start] > arr[next]) {
					int temp = arr[start] ;
					arr[start] = arr[next];
					arr[next] = temp ;
				}
				sortArray(arr, start, next+1) ;
			}else sortArray(arr, start+1, start+2) ;
		}
		
		return arr ;
	}
}
