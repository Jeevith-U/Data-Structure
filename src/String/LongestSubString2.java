package String;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * In This program we have to find the longest SubString Which is repeating
 */

public class LongestSubString2 {
	
	public static void main(String[] args) {
		
		String str = "sdereydjnspgysgygqydgydjnsp" ;
		
		String maxSub = "" ;
		
		HashMap<String, Integer> map = new HashMap<String, Integer>() ;
		
		for (int i = 0; i < str.length(); i++) {
			
			char c = str.charAt(i) ; 
			String curSubStr = "" ;
			curSubStr += c ;
			
			for (int j = i+1; j < str.length(); j++) {
				
				curSubStr += str.charAt(j) ;
				
				map.put(curSubStr, map.getOrDefault(curSubStr, 0)+1) ;
				
			}
		}
		
		
		Set<Entry<String, Integer>> set = map.entrySet() ;
		
		for(Entry<String, Integer> entry : set) {
			
			if(entry.getValue()>= 2 && entry.getKey().length() > maxSub.length()) maxSub = entry.getKey() ;
		}
		System.out.println(maxSub);
	}
}
