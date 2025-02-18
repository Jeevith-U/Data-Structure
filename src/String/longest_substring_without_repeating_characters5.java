package String;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class longest_substring_without_repeating_characters5 {
	
	public static void main(String[] args) {

		String s = "pwwkew";
		
		System.out.println(lengthOfLongestSubstring(s));

	}

	public static int lengthOfLongestSubstring(String s) {
		
		String maxStr = "", curstr =  "";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>() ;
		
		for (int i = 0; i < s.length() ; i++) {
			
			if(!map.containsKey(s.charAt(i))) {
				curstr += s.charAt(i) ;
				map.put(s.charAt(i), 1) ;
			}else {
				if(curstr.length() > maxStr.length()) maxStr = curstr ;
				map.clear();
				curstr = "" ;
			}
		}
		System.out.println(maxStr);
		return maxStr.length() ;
	}
}
