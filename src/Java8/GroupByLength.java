package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Jeevith
 * Group a list of strings by their lengths.
 */

public class GroupByLength {
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "bat", "cat", "dog", "elephant");
		
		Map<Integer, List<String>> result = strings.stream()
												   .collect(Collectors.groupingBy(s -> s.length())) ;
		
		System.out.println(result);
	}
}


