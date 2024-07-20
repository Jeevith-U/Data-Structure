package DSA;

import java.util.Iterator;
import java.util.Stack;

public class CheckParenthesis2 {

	public static void main(String[] args) {

		String str = "{[<>]}";

		char[] ch = str.toCharArray();

		Stack<Character> stack = new Stack<Character>();

		boolean flag = true;

		for (char c : ch) {

			if (c == '<' || c == '(' || c == '[' || c == '{')
				stack.push(c);

			else if (c == '>' || c == ')' || c == ']' || c == '}') {

				if (stack.isEmpty()) {

					flag = false;
					break;
				}

				char popchar = stack.peek();

				if ((c == '>' && popchar != '<') || (c == ')' && popchar != '(') ||

						(c == ']' && popchar != '[') || (c == '}' && popchar != '{')) {

					flag = false;
					break;
				}
				
				stack.pop();
			}
		}

		if (flag)
			System.out.println("Parentheesis are balanced");
		else
			System.out.println("Parentheesis are Not balanced");
	}

}
