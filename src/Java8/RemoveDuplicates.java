package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jeevith
 * Remove duplicates from a list of integers.
 */

public class RemoveDuplicates {
	
	public static void main(String[] args) {
	
		 List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		 
		 List<Integer> result = numbers.stream()
		 		.distinct()
		 		.collect(Collectors.toList()) ;
		 
		 System.out.println(result);
	}
}


