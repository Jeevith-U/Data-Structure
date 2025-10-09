package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author Jeevith
 *
 */

public class Test {
	
	public static void main(String[] args) {
		
		String s = "abc" ;
		
		String revStr = "" ;
		
		for(int i = s.length()-1 ; i >= 0 ; i--) {
			revStr+= s.charAt(i) ;
		}
		System.out.println(revStr);
	}
}


