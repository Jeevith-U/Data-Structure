package String;

import java.util.Stack;

public class ReverseStringOn_Parenthesis {
	
	public static void main(String[] args) {
		
		Stack<StringBuilder> stack = new Stack<StringBuilder>() ;
		
		String str = "(ed(et(oc))el)" ;
		
		StringBuilder newStr = new StringBuilder() ;
		
		for (int i = 0; i < str.length(); i++) {
			
			
		    if(str.charAt(i) == '(') {
		    	
		    	stack.push(newStr) ;
		    	newStr = new StringBuilder() ;
		    }
			
			else if(str.charAt(i) == ')') {
				
				newStr.reverse() ;
				
				StringBuilder popStr = stack.pop() ;
				
				popStr.append(newStr) ;
				
				newStr = popStr ;
			}else {
				newStr.append(str.charAt(i)) ;
			}
		}
		System.out.println(newStr.toString());
	}
}
