package String;

public class longest_substring_without_repeating_characters {

	public static void main(String[] args) {

		String s = "abcabcbb";

		System.out.println(solution(s));
		
	}

	private static int solution(String s) {

		String maxsub = "", curSub = "";

		for (int i = 0; i < s.length(); i++) {
			
			curSub += s.charAt(i) ;
			
			for (int j = i+1; j < s.length(); j++) {
				
				if(s.charAt(i) != s.charAt(j) && s.charAt(j) != s.charAt(j-1)) curSub += s.charAt(j) ;
				
				else {
					
					if(curSub.length() > maxsub.length()) maxsub = curSub ;
					curSub = "" ;
					break ;
				}
			}
			System.out.println(curSub +" : curSub & maxSub : "+maxsub);
		}	
		return maxsub.length() ;
	}
}
