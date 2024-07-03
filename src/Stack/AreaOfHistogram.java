package Stack;

import java.util.Arrays;
import java.util.Stack;

public class AreaOfHistogram {

	public static void main(String[] args) {

		int arr[] = { 4, 2, 1, 5, 6, 3, 2, 4, 2 };

		System.out.println("Max Area Of Histogram is :" + findMaxAreaofHistogram(arr));
	}

	public static int findMaxAreaofHistogram(int[] arr) {

		int[] nsr = findNsr(arr);
		int[] nsl = findNsl(arr);
		
		int max = 0 ;
		
		for (int i = 0; i < arr.length; i++) {
			
			int curMax = (nsr[i] - nsl[i] - 1)* arr[i] ;
			max = Math.max(max, curMax) ;
		}
		return max;
	}

	private static int[] findNsr(int[] arr) {

		int temp[] = new int[arr.length];

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = arr.length - 1; i >= 0; i--) {

			while (!stack.isEmpty() && arr[i] <= stack.peek()) stack.pop();

			if (stack.isEmpty())
				temp[i] = -1;
			else
				temp[i] = stack.peek();

			stack.push(arr[i]);
		}

		System.out.println(Arrays.toString(temp));
		return temp;
	}

	private static int[] findNsl(int[] arr) {
		
		int temp[] = new int[arr.length];

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < arr.length; i++) {

			while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();

			if (stack.isEmpty())
				temp[i] = -1;
			else
				temp[i] = stack.peek();

			stack.push(arr[i]);
		}

		System.out.println(Arrays.toString(temp));
		return temp;
	}
}
