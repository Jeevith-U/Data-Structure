package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Jeevith
 * find the element which has occurred more than once and return it as a list
 * 📌 Step
  - groupingBy(Function.identity(), Collectors.counting())`:
  - Function.identity() → just returns the number itself as the key.
  - Collectors.counting() → counts how many times each number appears.
  - This returns a `Map<Integer, Long>` where:
  - Key = Number from the list
  - Value = Count of how many times it appears

Example output for this step:
java
{1=2, 2=2, 3=3, 4=1, 5=1, 6=1}

 * 
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


