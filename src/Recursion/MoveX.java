package Recursion;

public class MoveX {
	
	public static void main(String[] args) {
		
		String str = "axbxxcdx" ;
		moveX(str, 0, "", 0) ;
	}

	private static void moveX(String str, int idx, String newString, int count) {
		
		if (idx == str.length()-1) {
			
			for (int i = 0; i < count; i++) {
				newString = newString+"x" ;
			}
			
			System.out.println(newString);
			
			return ;
		}
		else {
			if(str.charAt(idx) == 'x') count++ ;
			else newString += str.charAt(idx) ;
			moveX(str, idx+1, newString, count);
		}
		
	}
}
