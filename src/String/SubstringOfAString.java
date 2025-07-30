package String;

import java.util.HashMap;
import java.util.Map;

public class SubstringOfAString {
	
	public static void main(String[] args) {
		
		String s = "tracxn" , substr = "n";
		
		int res = findSubString(s, substr) ;
		
		System.out.println(res);
	}

	public static int findSubString(String s, String substr) {
		
		Map<String, Integer> map = new HashMap<String, Integer>() ;	
		
		String str = "" ;
		
		for(int i = 0 ; i < s.length() ; i++) {
			
			str += s.charAt(i) ;
			
			map.put(str, map.containsKey(str) ? map.get(str) + 1 : 1);
			
			for(int j = i+1 ; j < s.length() ; j++) {
				
				str += s.charAt(j) ;
				
				map.put(str, map.getOrDefault(str, 0)+1);
			}
			
			str = "" ;
		}
		
		System.out.println(map);
		
		
		return map.entrySet().stream().anyMatch(e -> e.getKey().equals(substr)) ? 1 : -1;

	}

}


