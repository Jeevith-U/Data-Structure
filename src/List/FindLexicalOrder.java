package List;

/**
 * @author Jeevith
 *
 */

public class FindLexicalOrder {
	
	public static void main(String[] args) {
		
		String s1 = "abc" ;
		
		String s2 = "aca" ;
		
		String result = findLexicalOrder(s1, s2) ;
		
		System.out.println(result);
	}

	private static String findLexicalOrder(String s1, String s2) {
		
		if(s1.hashCode() > s2.hashCode()) return s2 ;
		else return s1 ;
	}
}


