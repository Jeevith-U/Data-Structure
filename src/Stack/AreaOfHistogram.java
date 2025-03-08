package Stack;

import java.util.Arrays;
import java.util.Stack;

public class AreaOfHistogram {

    public static void main(String[] args) {

        int arr[] = { 4, 2, 1, 5, 6, 3, 2, 4, 2 };

        System.out.println("Max Area Of Histogram is :" + findMaxAreaofHistogram(arr));
    }

    public static int findMaxAreaofHistogram(int[] arr) {

        int[] nsr = findNsr(arr); // Nearest Smaller to Right (Indexes)
        int[] nsl = findNsl(arr); // Nearest Smaller to Left (Indexes)

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int width = nsr[i] - nsl[i] - 1;  // Width of the rectangle
            int curMax = width * arr[i];
            max = Math.max(max, curMax);
        }
        return max;
    }

    private static int[] findNsr(int[] arr) {
        int temp[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
           
        	while (!stack.isEmpty() && arr[stack.peek()] >= arr[i])
                stack.pop();

            if (stack.isEmpty())
                temp[i] = arr.length;  // Instead of -1, use length for boundary calculation
            else
                temp[i] = stack.peek(); // Store index, not value

            stack.push(i); // Store index
        }

        System.out.println("NSR: " + Arrays.toString(temp));
        return temp;
    }

    private static int[] findNsl(int[] arr) {
        int temp[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i])
                stack.pop();

            if (stack.isEmpty())
                temp[i] = -1;  // No smaller element on the left
            else
                temp[i] = stack.peek(); // Store index, not value

            stack.push(i); // Store index
        }

        System.out.println("NSL: " + Arrays.toString(temp));
        return temp;
    }
}
