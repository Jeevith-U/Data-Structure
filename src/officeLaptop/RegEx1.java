package DSA;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RegEx1 {
	
	public static void main(String[] args) {
		
		String [] strs = {"flower","flow","flight"} ;
		
		HashMap<String, Integer> map = new HashMap<String, Integer>() ;
		
		for(String str : strs) {
			
			for (int i = 0; i < str.length(); i++) {
				
				for (int j = i+1; j < str.length()-1; j++) {
					
					String s = str.substring(i, j) ;
					map.put(s, map.getOrDefault(s, 0)+1) ;
				}
			}
			
		}
		Set<Entry<String, Integer>> set = map.entrySet() ;
		
		for(Entry<String, Integer> entry : set) {
			
			if(entry.getKey().length() > 1 && entry.getValue() > 2) {
				System.out.println(entry.getKey());
			}
		}
	}
	
}
