package officeLaptop;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ReArrangeTheString {
	
	public static void main(String[] args) {
		
		String string = "This is too good program good too" ;
		
		String[] str = string.split(" ") ;
		
		LinkedHashMap<String, Integer> map =new LinkedHashMap<String, Integer>() ;
		
		String newString = "" ;
		
		for(String s : str ) {
			
				map.put(s, map.getOrDefault(s, 0)+1) ;
			
		}

		Set<Entry<String, Integer>> set = map.entrySet() ;
		
		for(Entry<String, Integer> entry : set) {
			if(entry.getValue() < 2) newString = newString +entry.getKey()+" " ;
		}
		
		System.out.println(newString);
	}
}
