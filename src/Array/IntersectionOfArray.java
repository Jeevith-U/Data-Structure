package Array;

import java.util.HashSet;

/**
 * @author Jeevith
 *
 */

public class IntersectionOfArray {
	
	public static void main(String[] args) {
		
		int arr1 [] = {5, 10, 15, 10} ;
		
		int arr2 [] = {15, 5, 5, 10, 4} ;
		
		int count = 0 ;
		
		HashSet<Integer> set = new HashSet<Integer>() ;
		
		for(int i : arr1) set.add(i) ;
		
		for(int i : arr2) {
			
			if(set.contains(i)) {
				count++ ;
				set.remove(i) ;
			}
		}
		
		System.out.println("The Count is : "+count);
	}
}


