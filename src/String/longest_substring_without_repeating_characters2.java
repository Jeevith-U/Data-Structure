package String;

public class longest_substring_without_repeating_characters2 {
	
	public static void main(String[] args) {
		
		String str = "pwwkew" ;
		
		String maxsub = "", curSub = ""  ;
		
		for(int i = 0 ; i < str.length() ; i++) {
			
			
			if(i == str.length()-2 && maxsub.length() == 0) maxsub += str.charAt(i) ;
			
//			if(str.charAt(i) != str.charAt(i+1)&& (!maxsub.contains(str.charAt(i)))) curSub += str.charAt(i) ;
			
			if(curSub.length()>maxsub.length()) {
				maxsub = curSub ;
				curSub = "" ;
			}
			
			System.out.println(maxsub);
		}
		
		System.out.println(maxsub.length());
	}
}
