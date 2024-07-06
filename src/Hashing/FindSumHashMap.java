package Hashing;

import java.util.HashMap;

public class FindSumHashMap {

    public static void main(String[] args) {

        int arr[] = {10, 15, -5, 15, -10};
        int k = 5;
        int currentSum = 0;
        boolean found = false;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            // Check if the current sum equals k
            if (currentSum == k) {
                System.out.println("Solution found from the 0th index to: " + i + "th Index");
                found = true;
                break;
            }

            // Check if there is a subarray (arr[0] to arr[i]) whose sum equals currentSum - k
            if (map.containsKey(currentSum - k)) {
                System.out.println("We will get the values from: " + (map.get(currentSum - k) + 1) + "th index to: " + i + "th index");
                found = true;
                break;
            }

            // Store the current sum with its index if not already present
            // This check is necessary to ensure we don't overwrite the index of the first occurrence of a particular sum
            if (!map.containsKey(currentSum)) {
                map.put(currentSum, i);
            }
        }

        if (!found) {
            System.out.println("Element Not Found");
        }
    }
}
