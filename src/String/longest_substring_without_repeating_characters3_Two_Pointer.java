package String;

import java.util.HashSet;

public class longest_substring_without_repeating_characters3_Two_Pointer {

	public static void main(String[] args) {

		String s = " ";

		System.out.println(solution(s));
		
	}

	private static int solution(String s) {
		
		int start = 0 , end = 0 , maxLength = 0;
		
		HashSet<Character> set = new HashSet<Character>() ;
		
		while(start < s.length()) {
			
			if(!set.contains(s.charAt(start))) {
				
				set.add(s.charAt(start)) ;
				maxLength = Math.max(maxLength, start - end + 1) ;
				start++ ;
			}else {
				set.remove(s.charAt(end)) ;
				end ++ ;
			}
			
		}

		return maxLength ;
		
	}
}
