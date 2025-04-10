package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Jeevith
 * find the element which has occurred more than once and return it as a list
 */

public class FindDuplicate {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 3, 3);
		
		List<Integer> list = numbers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.filter(f -> f.getValue() > 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList()) ;
		
		System.out.println(list);

	}
}


