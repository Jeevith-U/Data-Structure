package Recursion;

public class TCS1 {
	
	public static void main(String[] args) {
		
		String s = "how999you" ;
		String newString  = "" ;
		
		char [] ch =  s.toCharArray() ;
		
		for(char c : ch) {
			
			if(c == 'o')
				newString += '*' ;
			else if(c == 'a')
				newString += '@' ;
			else if (c == 'y') 
				newString += 'Y' ;
			else if (c == 'o') 
			newString += 'O' ;	
			else if (c == 'u') {
				newString += 'U' ;
			}
			else
				newString += c ;
		}
		
		System.out.println(newString);
	}
}
