package DSA;

import java.util.HashMap;
import java.util.HashSet;

public class RomanToInt {
	
	public static void main(String[] args) {
		
		System.out.println(romanToInt("III"));
		
		
	}

	public static int romanToInt(String s) {
     HashMap<Character, Integer> map = new HashMap<Character, Integer>() ;
		
		map.put('I', 1) ;
		map.put('V', 5) ;
		map.put('X', 10) ;
		map.put('L', 50) ;
		map.put('C', 100) ;
		map.put('D', 500) ;
		map.put('M', 1000) ;
		
		char ch [] = s.toCharArray() ;
		
		int result = 0 ;
		
		for(int i = ch.length-1 ; i >= 0 ; i--) {
			
			if(i == 0) result += map.get(ch[i]) ;
			
			else if(map.containsKey(ch[i])) {
				
				int current = map.get(ch[i]) ;
				
				int next = map.get(ch[i-1]) ;
				
				if (next < current) {
	                result += current - next;
	                i--; 
	            }
				else result += current ;
				
			}
			
		}
		
		return result ;
	}
}
