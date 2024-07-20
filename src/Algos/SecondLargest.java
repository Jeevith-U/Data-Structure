package Algos;

public class SecondLargest {
	
	public static void main(String[] args) {
		
		int arr [] = {18, 26, 12, 52, 19} ;
		
		int max = 0, currentMax = 0 ;
		
		int secondMax = 0 ;
		
		for (int i = 0; i < arr.length; i++) {
			currentMax = arr[i] ;
			
			if (currentMax > max) 
				max = currentMax ;
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			currentMax = arr[i] ;
			
			if (currentMax > secondMax && currentMax < max) 
				secondMax = currentMax ;
		}
		System.out.println(secondMax);
	}
}
