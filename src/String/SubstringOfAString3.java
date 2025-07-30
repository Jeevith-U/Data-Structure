package String;

import java.util.HashSet;
import java.util.Set;

public class SubstringOfAString3 {
	
	public static void main(String[] args) {
		
		String s = "tracxn" , substr = "xcn";
		
		int res = findSubString(s, substr) ;
		
		System.out.println(res);
	}

	public static int findSubString(String s, String substr) {
		
		Set<String> set = new HashSet<>();
		
		for(int i = 0 ; i < s.length() ; i++) {
			
			StringBuilder builder = new StringBuilder() ;
			
			for(int j = i ; j < s.length() ; j++) {
				
				builder.append(s.charAt(j)) ;
				
				set.add(builder.toString()) ;
			}
		}
		
		return set.contains(substr) ? 1 : -1 ;
		
	}

}


