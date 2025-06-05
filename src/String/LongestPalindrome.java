package String;

/**
 * @author Jeevith
 *
 */

public class LongestPalindrome {
	
	public static void main(String[] args) {
		
		longestPalindrome("TheMalayalamMamisGood") ;
	}

	public static void longestPalindrome(String s) {
		
		s = s.toLowerCase() ;
		
		int maxLen = 0 ;
		
		String maxSubStr = "" ;
		
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = i+1; j < s.length(); j++) {
				
				int len = j - i ;
				
				String curString = s.substring(i, j +1) ;
				
				if(isPalindrome(curString)) {
					if (len > maxLen) {
						
						maxLen = len ;
						maxSubStr = curString ;
					}
				}
			}
		}
		
		System.out.println("Max Sub String : "+maxSubStr+" with the length : "+maxLen);
	}

	public static boolean isPalindrome(String curString) {
		
		int s = 0, e = curString.length()-1 ;
		
		while (s <= e) {
			
			if(curString.charAt(s) != curString.charAt(e)) return false ;
			
			else {
				s++ ;
				e-- ;
			}
		}
		
		return true ;
	}
}


