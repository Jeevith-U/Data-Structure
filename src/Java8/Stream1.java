package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jeevith
 * write a java program to find the even numbers
 */

public class Stream1 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		List<Integer> evenNumers = numbers.stream()
				.filter(i -> (i % 2) == 0)
				.collect(Collectors.toList()) ;
		
		System.out.println(evenNumers);
	}

}


