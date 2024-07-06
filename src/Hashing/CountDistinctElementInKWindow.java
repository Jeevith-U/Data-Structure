package Hashing;

/*
 * IN this problem we have to find out the distinct element in the array for k elements
 * if array is [1,2,2,1,3,1,1,3]
 * 1st k set is [1,2,2,1] distinct element = 2
 * 2nd k set is [2,2,1,3] distinct element = 3
 * 3rd k set is [2,1,3,1] distinct element = 3
 * 4th k set is [1,3,1,1] distinct element = 2
 * 4th k set is [3,1,1,3] distinct element = 2
 */
public class CountDistinctElementInKWindow {
	
	public static void main(String[] args) {
		
		int arr [] = {1,2,2,1,3,1,1,3} ;
		
		int k = 0 ;
		
		for (int i = 0; i < arr.length; i++) {
			
			int count = 0 ;
			
			for (int j = i; j < i+k-1; j++) {
				
				for (int j2 = i+1; j2 < j+k-1; j2++) {
					
					if(arr[j] != arr[j2]) count++ ;
				}
				
			}
			System.out.println(count);
		}
	}
	
}
