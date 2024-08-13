package String;

/**
 * @author Jeevith
 *
 */

public class Valid_Number {
	public static boolean isNumber(String s) {

		s.toLowerCase() ;
		
		try {
			if (s.contains("f")||s.contains("F")||s.contains("d")||s.contains("D"))
				throw new ArithmeticException();
			Double.parseDouble(s);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public static void main(String[] args) {

		System.out.println(Double.parseDouble("Infinity"));
	}
}


