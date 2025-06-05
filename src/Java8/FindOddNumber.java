package Java8;

import java.util.List;
import java.util.stream.Collectors;

/**
 */

public class FindOddNumber {
	
	public static void main(String[] args) {
		
		List<Integer> l = List.of(10, 31, 63, 47, 22, 35) ;
		
		List<Integer> data = l.stream()
								.filter(i -> (i & 1) == 1)
								.collect(Collectors.toList()) ;
		
		System.out.println(data);
	}
}


