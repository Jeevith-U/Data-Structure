package Java8;

/**
 */

public class FindPalindromeString2 {
	
	public static void main(String[] args) {
		
		String s = "Madam" ;
		
		findPailindrome(s) ;
	}

	public static void findPailindrome(String s) {
		
		String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(cleaned)
                                           .reverse()
                                           .toString();
        boolean res = cleaned.equals(reversed);
		
		if(res) System.out.println("The given String is Palindrome");
		
		else System.out.println("The given String is not a Palindrome");
	}
}


