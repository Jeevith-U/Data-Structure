package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Find_Nearst_SmallNumber_Left {
	
public static void main(String[] args) {
		
		int arr [] = {3,7,4,15,9} ;
		
		System.out.println(Arrays.toString(find(arr)));
	}
	
	public static int[] find(int arr []) {
		
		int temp [] = new int [arr.length] ;
		
		Stack<Integer> stack = new Stack<Integer>() ;
		
		for(int i = 0 ; i < arr.length ;i++) {
			
			if(stack.isEmpty()) temp[i] = -1 ;
			else if(!stack.isEmpty() && stack.peek() < arr[i]) temp[i] = stack.peek() ;
			else if(!stack.isEmpty() && stack.peek() > arr[i]) {
			while(!stack.isEmpty() && stack.peek() > arr[i]) 
				stack.pop() ;
			
			if(stack.isEmpty()) temp[i] = -1 ;
			else temp[i] = stack.peek() ;
			}
			stack.push(arr[i]) ;
		}
		
		return temp ;
	}

}
