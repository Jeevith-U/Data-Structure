package Array;

import java.util.Iterator;

public class WatterTrapping {
	
	public static void main(String[] args) {
		
		int arr [] = {3, 1, 2, 4, 0, 1, 3, 2} ;
		
		System.out.println("The Max Water Can Store is : "+calculateWater(arr)+" Units");
		
	}

	private static int calculateWater(int[] arr) {
		
		int leftMax [] = new int [arr.length] ;
		int rightMax [] = new int [arr.length] ;
		
		int waterUnit = 0 ;
		
		leftMax[0] = arr[0] ;
		for (int i = 1; i < arr.length; i++) {
			leftMax[i] = Math.max(leftMax[i-1], arr[i]) ;
		}
		
		rightMax[arr.length -1 ] = arr[arr.length-1] ;
		
		for(int i = arr.length -2 ; i >= 0 ; i--) {
			rightMax[i] = Math.max(rightMax[i+1], arr[i]) ;
		}
		
		for (int i = 0; i < rightMax.length; i++) {
			
			waterUnit += Math.min(leftMax[i], rightMax[i]) - arr[i] ;
		}
		
		
		return waterUnit ;
	}
}
