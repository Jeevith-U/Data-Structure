package Java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jeevith
 * Find the maximum value from a list of integers.
 */

public class MaxValue {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		
		int max = numbers.stream()
						 .max(Integer :: compareTo)
						 .get() ;
		
		System.out.println(max);
						 
	}
}


