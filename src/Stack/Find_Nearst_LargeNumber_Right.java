package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Find_Nearst_LargeNumber_Right {
	
	public static void main(String[] args) {
		
		int arr [] = {1, 3, 2, 4} ;
		
	    System.out.println(Arrays.toString(find(arr)));
	}
	
	public static int[] find(int arr[]) {
		
		int temp [] = new int [arr.length] ;
		
		Stack<Integer> stack = new Stack () ;
		
		for(int i = arr.length - 1 ; i >= 0 ; i--) {
			
			if(stack.isEmpty()) temp[i] = -1 ;
			else if (!stack.isEmpty() && arr[i] < stack.peek())temp[i] = stack.peek() ;
			else if (!stack.isEmpty() && arr[i] > stack.peek()) {
				while (!stack.isEmpty() && arr[i] >= stack.peek()) {
		            stack.pop();
		        }
				if(stack.isEmpty()) temp[i] = -1 ;
				else temp[i] = stack.peek() ;
			}
			stack.push(arr[i]) ;
		}
		
		return temp ;
	}
}
