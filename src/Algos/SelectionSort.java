package Algos;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int arr [] = {8, 6, 2, 5, 1} ;
		
		for(int i = 0 ; i < arr.length ; i++){

		       int select = i ;
		       
		       for(int j = i+1 ;j < arr.length ; j++){

		           if(arr[select] > arr[j])

		              select = j ;
		       }
		       
		       if(select != i) {
		    	   int temp = arr[select] ;
		    	   arr[select] = arr[i] ;
		    	   arr[i] = temp ;
		       }
		   }
		System.out.println(Arrays.toString(arr));
	}
}
