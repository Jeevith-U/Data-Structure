package String;

import java.util.Stack;

/**
 * @author Jeevith
 *
 * Jeevith
 */
public class Valid_Parentheses {
	
	public static void main(String[] args) {
		
		String s  = "()" ;
		
		System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {
		
		boolean isValid = true ;
		
		Stack<Character> stack = new Stack<Character>() ;
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '<') stack.push(s.charAt(i)) ;
			else {
				
				if(!stack.isEmpty()) {
				
				char curChar = s.charAt(i) ;
				char peekchar = stack.peek() ;
                
			   if((curChar == ')' && peekchar != '(') || (curChar == '}' && peekchar != '{') ||
				  (curChar == ']' && peekchar != '[') || (curChar == '>' && peekchar != '<')) {
				   isValid = false ;
				   break ;
			   }
			} else {
				isValid = false ; 
				break ;
			}
		 
		stack.pop() ;
			}
		}
		
		if (! stack.isEmpty()) return false ;
		else return isValid ;
	}
}
