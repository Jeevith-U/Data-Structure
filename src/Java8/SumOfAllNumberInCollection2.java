package Java8;

import java.util.List;
import java.util.stream.Collectors;

/**
 */

public class SumOfAllNumberInCollection2 {
	
	public static void main(String[] args) {
		
		List<Integer> l = List.of(10, 31, 63, 47, 22, 35) ;
		
		Integer data = l.stream()
				           	.mapToInt(Integer::intValue)
				           	.sum() ;
		
		System.out.println(data);
	}
}


