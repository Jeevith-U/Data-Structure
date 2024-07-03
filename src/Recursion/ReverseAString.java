package Recursion;

public class ReverseAString {
	
	public static void main(String[] args) {
		
		String name = "Jeevith" ;
		
		reverseName(name,name.length()-1 ) ;
	}

	private static void reverseName(String name, int i) {
		
		if(i < 0) return ;
		else System.out.print(name.charAt(i)+" ");
		reverseName(name, i-1);
		
	}
}
