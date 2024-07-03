package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
	
	public static void main(String[] args) {
		
		int arr [] = {100, 80, 60, 70, 60, 75, 85} ;
		
		System.out.println(Arrays.toString(findCount(arr) ));
	}

	private static int[] findCount(int[] arr) {
		
		int temp [] = new int [arr.length] ;
		
		Stack<Integer> stack = new Stack<Integer>() ;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(stack.isEmpty()) temp[i] = 1 ;
			else if (!stack.isEmpty() && stack.peek() >= arr[i]) temp[i] = 1 ;
			else if (!stack.isEmpty() && stack.peek() < arr[i]) {
				int count = 0 ;
				System.out.println("SomeThingIS Happening");
				while (!stack.isEmpty() && stack.peek() <= arr[i]) {
					count++ ;
					stack.pop() ;
					System.out.println("Something Went Wrong");
				}
				
				temp[i] = count ;
				count = 0 ;
			}
			stack.push(arr[i]);
		}
		return temp;
	}
}
