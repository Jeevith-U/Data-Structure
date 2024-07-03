/*
 * The Array will be given and value k will be given
 * we have to find which sub array is equal to the value k after performing some opertaions
 * 
 * 
 */

package Hashing;

public class FindSum {

	public static void main(String[] args) {
		
		int arr [] = {10, 15, -5, 15, -10, 5} ;
		
		int k = 5 ;
		
		boolean flag = true ;
		
		for(int i = 0 ; i < arr.length-1 ; i++) {
			
			int sum = 0 ;
			
			for (int j = i; j < arr.length; j++) {
				
				sum += arr[j] ;
				
				if(sum == k) {
					System.out.println("We Will Get the Values from : "+i+" th Index to : "+j+" th index");
					flag = false ;
					break ;
				}
				
			}
		}
		
		if(flag) System.out.println("Can't found the Array");
	}
}
