package String;

/**
 * @author Jeevith
 *
 */

public class Valid_Number3 {

	public static void main(String[] args) {
		
		String s  = "Infinity" ;
		
		System.out.println(isValid(s)); ;
	}

	public static boolean isValid(String s) {
		
//		s.toLowerCase() ;
		
		double d = Double.parseDouble(s) ;
		
		if(s.equalsIgnoreCase("Infinity")) return false ;
		
		else {
		try {
			Double.parseDouble(s) ;
		} catch (Exception e) {
			return false ;
		}
		return true ;
		}
	}
}


