package Java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jeevith
 * Calculate the sum of squares of all odd numbers in a list.
 *
 */

public class SumOfSquares {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		int sum = numbers.stream()
				.filter(i -> i % 2 != 0)
				.map(i -> i * i)
				.reduce(0, Integer::sum) ;
		
		System.out.println(sum);
	}
}


