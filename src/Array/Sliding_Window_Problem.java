package Array;

/*
 * We will be given with an Array like = [1, 2, 3, 1, 5, 3, 2, 4, 2, 1, 2, 4,]
 * 
 * and we will be given with k here k = 3
 * 
 * and we have to find the maximum element with that k limit and latter we have to move on next 
 * 
 * in total we will find n - k + 1 elements
 */
public class Sliding_Window_Problem {
	
	public static void main(String[] args) {
		
		int arr [] = {1, 2, 3, 1, 5, 3, 2, 4, 2, 1, 2, 4} ;
		
		int k = 3 ;
		
		findMax(arr, k) ;
	}

	public static void findMax(int[] arr, int k) {
		
		int max ;
		
		for (int i = 0; i < arr.length-k; i++) {
			
			max = arr[0] ;
			
			for(int j = 1; j < k ; j++) {
				
				if(arr[i+j] > max) max = arr[i+j] ;
			}
			
			System.out.println(max);
		}
	}
	
}
