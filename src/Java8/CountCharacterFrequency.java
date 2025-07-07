package Java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Jeevith
 *
 */

public class CountCharacterFrequency {
	
	public static void main(String[] args) {
		
		String input = "infinity";

        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char) c) 
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequencyMap);
	}
}


