package Hashing;

import java.util.HashMap;

/*
 * IN this problem we have to find out the distinct element in the array for k elements
 * if array is [1,2,2,1,3,1,1,3]
 * 1st k set is [1,2,2,1] distinct element = 2
 * 2nd k set is [2,2,1,3] distinct element = 3
 * 3rd k set is [2,1,3,1] distinct element = 3
 * 4th k set is [1,3,1,1] distinct element = 2
 * 4th k set is [3,1,1,3] distinct element = 2
 */
public class CountDistinctElementInKWindow2 {
	
	public static void main(String[] args) {
		
		int arr [] = {1,2,2,1,3,1,1,3} ;
		
		int k = 4 ;
		
		countDistinctElement(arr, k) ;
		
	}

	public static void countDistinctElement(int arr [], int k) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>() ;
		
		for (int i = 0; i < k ; i++) {
			
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1) ;
			
		}
		System.out.println(map.size());
		
		for (int i = k ; i < arr.length; i++) {
			
			if (map.get(arr[i-k]) ==1)map.remove(arr[i-k]) ;
			
			else map.put(arr[i-k], map.get(arr[i-k])-1) ;
			
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1) ;
			
			System.out.println(map.size());
		}
	}
	
}
