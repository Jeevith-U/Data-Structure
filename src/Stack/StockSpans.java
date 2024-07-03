package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpans {
    
    public static void main(String[] args) {
        int arr[] = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = calculateStockSpan(arr);
        System.out.println(Arrays.toString(spans));
    }

    public static int[] calculateStockSpan(int[] prices) {
        int n = prices.length;
        int[] spans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            // Pop elements from the stack while the current price is greater than or equal to the price at the top of the stack
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            // If stack becomes empty, the current day is the first day with a price greater than or equal to the current day, so span is i+1
            if (stack.isEmpty()) {
                spans[i] = i + 1;
            } else {
                spans[i] = i - stack.peek();
            }
            // Push the current day onto the stack
            stack.push(i);
        }
        
        return spans;
    }
}

