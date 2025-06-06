package Java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 */

public class ChangeStringCaseSensitivity {

	public static void main(String[] args) {

		List<String> l = List.of("BanAnA", "AppLE", "CherY", "RaMyA", "SuNNy", "manGo", "Death");

		 List<String> data = l.stream()
							   .map(i -> i.toUpperCase())
							   .collect(Collectors.toList());
		 
		 List<String> data1 = l.stream()
				   			   .map(i -> i.toLowerCase())
				               .collect(Collectors.toList());
		
		System.out.println(data);
		System.out.println(data1);
	}

}
