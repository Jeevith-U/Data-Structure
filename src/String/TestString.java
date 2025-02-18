package String;

import java.util.Arrays;

/**
 * @author Jeevith
 *
 */

public class TestString {
	
	public static void main(String[] args) {
		
		String s = "trillionaire Jeevith" ;
		
		String word = "trilli" ;
		
		String[] res = s.split("i") ;
		
//		System.out.println(Arrays.toString(res));
		
//		System.out.println(s.compareToIgnoreCase("JaiRaj"));
		
//		System.out.println(s.indexOf("Jee"));
		
		String trimedValue = s.trim();
//		System.out.println(trimedValue);
		
		System.out.println(s.startsWith(word));
		
		
	}
}


