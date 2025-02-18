package String;

import java.util.HashMap;

public class longest_substring_without_repeating_slidingwindow {

	public static void main(String[] args) {

		String s = "pwwkew";

		System.out.println(solution(s));
		
	}

	public static int solution(String s) {

		if(s == null || s.length() == 0) return 0 ;
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>() ;
		
		int maxLen = 0, start = 0 ;
		
		for(int end = 0 ; end < s.length() ; end++) {
			
			char currentChar = s.charAt(end) ;
			
			if(map.containsKey(s.charAt(end))) {
				
				int lastIndex = map.get(currentChar) ;
				
				if(lastIndex >= start ) start = lastIndex+1 ;
			}
			
			map.put(s.charAt(end), end) ;
			maxLen = Math.max(maxLen, end - start + 1) ;
		}
		
		return maxLen ;
	}
}
