package String;

/**
 * @author Jeevith
 *
 */

public class LongestPalindrome2 {
	
	public static void main(String[] args) {
		
		String res = longestPalindrome("TheMalayalamMamisGood") ;
		
		System.out.println(res);
	}

	public static String longestPalindrome(String s) {
		
		s = s.toLowerCase() ;
		
		if(s == null || s.length() < 1) return ""  ;
		
		int start = 0, end = 0 ;
		
		for (int i = 0; i < s.length() ; i++) {
			
			int len1 = expandFromCenter(s, i, i) ;
			int len12 = expandFromCenter(s, i, i+1) ;
			int len  = Math.max(len1, len12) ;

			if(len > end - start) {
				start = i - (len - 1)/2 ;
				end = i + len / 2 ;
			}
		}
		return s.substring(start, end+1) ;
	}

	private static int expandFromCenter(String str, int s, int e) {
		
		while(s >= 0 && e < str.length() && str.charAt(s) == str.charAt(e)) {
			s--;
			e++ ;
		}
		return e - s - 1;
	}

}


