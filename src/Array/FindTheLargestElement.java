package Array;

/**
 * @author Jeevith
 *
 */

public class FindTheLargestElement {
	
	public static void main(String[] args) {
		
		int arr [] = {15, 31, 9, 56, 62, 45} ;
		
		int max = arr[0] ;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(arr[i] > max) max = arr[i] ;
		}
		
		System.out.println(max);
	}

}


