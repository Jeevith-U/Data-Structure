package Array;

import java.util.Arrays;

public class Boyer_Moore_Majority_Vote_Algorithm2 {
	
	public static void main(String[] args) {
		
		int arr [] = {2, 5, 3, 2} ;
		
		Arrays.sort(arr);
		
		int max = arr.length/2,  count = 0 ; ;
		
		for(int i = 0 ; i < arr.length-1 ; i++) {
			
			if(arr[i] == arr[i+1]) count++ ;
			else {
				if(count == max) {
					System.out.println(i);
					count = 0 ;
				}
				else count = 0 ;
			}
		}
	}
}
