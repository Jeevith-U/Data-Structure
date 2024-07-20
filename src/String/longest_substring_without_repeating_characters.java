package String;

public class longest_substring_without_repeating_characters {

	public static void main(String[] args) {

		String s = "pwwkew";

		System.out.println(solution(s));
		
	}

	private static int solution(String s) {

		String maxsub = "", curSub = "";

		if (s == null || s.length() == 1)
			return 1;

		for (int i = 0; i < s.length()- 1; i++) {

			if (i == s.length() - 2 && maxsub.length() == 0)
				maxsub += s.charAt(i);

			if ((s.charAt(i) != s.charAt(i + 1)) && i != s.length() - 1) {
				curSub += s.charAt(i);
			}

			if (curSub.length() > maxsub.length()) {
				maxsub = curSub;
				curSub = "";
			} 
			
			System.out.println(maxsub);
		}
		
//		if(s.charAt(s.charAt(s.length()-2)) != s.charAt(s.length()-1)) maxsub += s.charAt(s.length()-1) ;
		
		return maxsub.length() ;
		
	}
}
