package Array;

/**
 * @author Jeevith
 *
 */

public class FindTheSecondLargestElement2 {
	
	public static void main(String[] args) {
		
		int arr [] = {15, 31, 9, 56, 62, 45} ;
		
		int max = arr[0], secondMax = arr[0] ;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(arr[i] > max) {
				secondMax = max ;
				max = arr[i] ;
			}else if(arr[i] > secondMax && arr[i] < max) secondMax = arr[i] ;
		}
		
		System.out.println(max);
		System.out.println(secondMax);
	}

}


