package Recursion;

public class SubStrings {

	public static void main(String[] args) {

		String str = "abc";
		printSubString(str, 0, "");
	}

	public static void printSubString(String str, int idx, String newString) {
		
		if(idx == str.length()) {
			System.out.println(newString);
			return  ;
		}
		
		char cuurentChar = str.charAt(idx) ;
		
		printSubString(str, idx+1, newString+cuurentChar);
		printSubString(str, idx+1, newString);

	}

}
