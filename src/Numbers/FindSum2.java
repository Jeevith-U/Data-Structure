package Numbers;
import java.util.*;

/**
 * @author Jeevith
 *
 */
public class FindSum2 {
   
	public static void findPairs(int[] arr, int n) {
        
		boolean found = false;

		int start = 0, end = arr.length -1 ;
        
		while(start < end) {
			
			if((arr[start] + arr[end]) == n) {
				System.out.println("Pair ( +"+arr[start]+", "+arr[end]+" )");
				found = !found ;
				start++ ;
				end-- ;
			}
			else if ((arr[start] + arr[end]) < n) start++ ;
			
			else end-- ;
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
