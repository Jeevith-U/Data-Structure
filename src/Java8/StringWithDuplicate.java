package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jeevith
 */

public class StringWithDuplicate {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("John", "Jane", "John", "Doe", "Jane");
				
				List<String> data = names.stream()
										 .distinct() 
						                 .collect(Collectors.toList()) ;
				
				System.out.println(data);
	}
}


