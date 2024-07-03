package Recursion;

public class MoveX2 {
	
	public static void main(String[] args) {
		
		String str = "axbxxcdx" ;
		System.out.println(moveX(str) );
	}

	private static String moveX(String str) {
		
		if(str.isEmpty() || str.length() == 1) {
			return str;
		}
		
		char fc = str.charAt(0) ;
		
		if(fc == 'x')
			return moveX(str.substring(1))+fc;
		else return fc+moveX(str.substring(1));
	}
}
