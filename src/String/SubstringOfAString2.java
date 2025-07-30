package String;

import java.util.HashMap;
import java.util.Map;

public class SubstringOfAString2 {
	
	public static void main(String[] args) {
		
		String s = "tracxn" , substr = "cxn";
		
		int res = s.contains(substr) ? 1 : -1 ;
		
		System.out.println(res);
		
	}

}


