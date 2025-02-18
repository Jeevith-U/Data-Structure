package LeetCode;
import java.util.*;

/**
 * @author Jeevith
 *
 */


public class SubsetSumBruteForce {
    
	public static void findSubsets(int[] arr, int index, List<Integer> subset, int sum, int target) {
 
		if (sum == target) {
            System.out.println(subset);
            return;
        }
        if (index == arr.length) {
            return;
        }

        subset.add(arr[index]);
        findSubsets(arr, index + 1, subset, sum + arr[index], target);

        subset.remove(subset.size() - 1);
        findSubsets(arr, index + 1, subset, sum, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int n = 6;
        System.out.println("Subsets that sum to " + n + ":");
        findSubsets(arr, 0, new ArrayList<>(), 0, n);
    }
}


