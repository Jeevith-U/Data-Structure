package Algos;

public class SecondLargest {
	
	public static void main(String[] args) {
		
		int arr [] = {8, 6, 2, 5, 1} ;
		
		int max = 0, currentMax = 0 ;
		
		int secondMax = 0 ;
		
		for (int i = 0; i < arr.length; i++) {
			currentMax = arr[i] ;
			
			if (currentMax > max) 
				max = currentMax ;
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			currentMax = arr[i] ;
			
			if (currentMax > secondMax && secondMax < max) 
				secondMax = currentMax ;
			System.out.println(secondMax);
		}
		System.out.println(max);
		System.out.println(secondMax);
	}
}
