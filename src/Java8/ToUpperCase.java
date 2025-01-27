package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jeevith
 * Convert all strings in a list to uppercase
 */

public class ToUpperCase {
	
	public static void main(String[] args) {
		
		 List<String> strings = Arrays.asList("java", "streams", "feature");
		 
		 List<String> updatedString = strings.stream()
		 		.map(s -> s.toUpperCase())
		 		.collect(Collectors.toList()) ;
		 
		 System.out.println(updatedString);
	}
}


