package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Jeevith
 *
 */

public class FindDuplicateElementInCollection {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("John", "Jane", "John", "Doe", "Jane");
		
				List<String> data = names.stream()
												.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
												.entrySet()
												.stream()
												.filter(e -> e.getValue() > 1)
												.map(Map.Entry::getKey)
												.collect(Collectors.toList()) ;
				
				System.out.println(data);
				
				
				}
}


