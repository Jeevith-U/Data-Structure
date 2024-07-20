package String;

/*
 * Example 1:

Input: s = "(abcd)"
Output: "dcba"
Example 2:

Input: s = "(u(love)i)"
Output: "iloveu"
Explanation: The substring "love" is reversed first, then the whole string is reversed.
Example 3:

Input: s = "(ed(et(oc))el)"
Output: "leetcode"
Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.
 
 */

public class reverse_substrings_between_each_pair_of_parentheses {
	
	public static void main(String[] args) {
		
		char [] s = "(abcd)".toCharArray() ;
		
		String newStr = "" ;
		
		for (int i = s.length-1; i >= 0; i--) {
			
			if(s[i] == '(' || s[i] == ')') continue ;
			else newStr += s[i] ;
		}
		System.out.println(newStr);
	}
}
