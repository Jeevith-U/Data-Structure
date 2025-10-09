package Java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jeevith
 *
 */

public class FindNthMax {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 25, 3, 47, 19);
		
		int count = 4 ;
		
		int res = find(numbers, count) ;
		
		System.out.println(res);
	}

	public static int find(List<Integer> numbers, int count) {
		
		return numbers.stream()
					  .sorted((a, b) -> b - a)
					  .skip(count-1)
					  .findFirst() 
					  .orElse(null) ;

	}

}


