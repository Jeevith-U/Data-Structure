package String;

/*
 * In This program we have to find the longest SubString Which is repeating
 */

public class LongestSubString {
	
	public static void main(String[] args) {
		
		String str = "sdereydjnspgysgygqydgydjnsp" ;
		
		String maxSub = "" ;
		
		for (int i = 0; i < str.length(); i++) {
			
			for (int j = i+1; j < str.length()-1; j++) {
				
				if(str.charAt(i) == str.charAt(j)) {
					int idx1 = i, idx2 = j ;
					String curStr = "" ;
					while((str.charAt(idx1) == str.charAt(idx2)) && (idx1 < str.length()) && (idx2 < str.length()-1)) {
						curStr += str.charAt(idx1) ;
						idx1++ ;
						idx2++ ;
					}
					
					if(idx2 == str.length()-1) curStr += str.charAt(idx2) ;
					
					if(curStr.length() > maxSub.length()) maxSub = curStr ;
				}
			}
		}
		System.out.println(maxSub);
	}
	
}
