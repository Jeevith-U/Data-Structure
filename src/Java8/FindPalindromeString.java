package Java8;

import java.util.stream.IntStream;

/**
 */

public class FindPalindromeString {
	
	public static void main(String[] args) {
		
		String s = "Madam" ;
		
		findPailindrome(s) ;
	}

	public static void findPailindrome(String s) {
		
		String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean res = IntStream.range(0, cleaned.length()/2)
        	                   .allMatch(i -> cleaned.charAt(i) == cleaned.charAt(cleaned.length()-i-1)) ;		
		
		if(res) System.out.println("The given String is Palindrome");
		
		else System.out.println("The given String is not a Palindrome");
	}
}


