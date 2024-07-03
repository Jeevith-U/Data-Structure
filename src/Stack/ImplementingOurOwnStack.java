package Stack;

import java.util.ArrayList;
import java.util.List;

public class ImplementingOurOwnStack {
	
	static List<Integer> stackData = new ArrayList<Integer>() ;
	
	public static void push(int num) {
		
		stackData.add(num) ;
	}
	
	public static void pop() {
			
		for (int i = stackData.size()-1 ; i >= 0 ; i--) {
			
				stackData.remove(i) ;
				break ;
		}
	}
	
	public static void showStack() {
		
		for (int i = stackData.size()-1 ; i >= 0 ; i--) {
			System.out.println(stackData.get(i));
		}
	}
}
