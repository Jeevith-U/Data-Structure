package Numbers;
import java.util.*;

/**
 * @author Jeevith
 *
 */


public class FindSum {
   
	public static void findPairs(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        boolean found = false;

        for (int num : arr) {
            int complement = n - num;
            if (set.contains(complement)) {
                System.out.println("Pair: (" + complement + ", " + num + ")");
                found = true;
            }
            set.add(num);
        }

        if (!found) {
            System.out.println("No pairs found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int n = 6;
        findPairs(arr, n);
    }
}
