package Java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jeevith
 *
 */

public class FindSecondMaxWithDuplicate {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 25, 3, 47, 19);
		
		int secMAx = numbers.stream()
							.distinct()
							.sorted((a, b ) -> b - a)
							.skip(1)
							.findFirst()
							.orElse(null) ;
		
		System.out.println(secMAx);
	}
}


