package Java8;

import java.util.List;
import java.util.stream.Collectors;

/**
 */

public class ProductOfAllNumberInCollection2 {
	
	public static void main(String[] args) {
		
		List<Integer> l = List.of(10, 31, 63, 47, 22, 35) ;
		
		Integer data = l.stream()
				           	.reduce(1, (a , b) -> a * b) ;
		
		System.out.println(data);
	}
}


