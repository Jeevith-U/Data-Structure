package Algos;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int arr [] = {8, 6, 2, 5, 1} ;
		
		for(int i = 0 ; i < arr.length ; i++){

		       int select = i ;
		       
		       for(int j = i+1 ;j < arr.length ; j++){

		           if(arr[select] > arr[j]){

		               arr[select] = arr[select] + arr[j] ;
		               arr[j] = arr[select] - arr[j] ;
		               arr[select] = arr[select] - arr[j] ;
		           }
		       }
		   }
		System.out.println(Arrays.toString(arr));
	}
}
