package Array;

import java.util.HashMap;

/*
 * We will be given with an Array like = [1, 2, 3, 1, 5, 3, 2, 4, 2, 1, 2, 4,]
 * 
 * and we will be given with k here k = 3
 * 
 * and we will be given with k here k = 3
 * 
 * and we have to find the distinct element in the given window of k
 */
public class Sliding_Window_Problem2 {
	
	public static void main(String[] args) {
		
		int arr [] = {1, 2, 2 , 1, 3, 1, 1,  3} ;
		
		int k = 4 ;
		
		findMax(arr, k) ;
	}

	public static void findMax(int[] arr, int k) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>() ;
		
		for (int i = 0; i < k; i++) {
			
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1) ;
		}
		
		System.out.println(map.size());
		
		for (int i = k; i < arr.length ; i++) {
			
			/*for moving forward by deleting the last window starting*/
			
			if(map.get(arr[i-k]) == 1) map.remove(arr[i-k]) ;
			
			else map.put(arr[i-k], map.get(arr[i-k])-1) ;
			
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1) ;
			
			System.out.println(map.size());
		}
	}
	
}
