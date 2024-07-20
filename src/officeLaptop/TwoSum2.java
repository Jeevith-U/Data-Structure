package DSA;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum2 {

    public static void main(String[] args) {

        int nums[] = {3, 2, 4};
        int target = 6;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                arr[0] = map.get(complement);
                arr[1] = i;
                break;
            }
            
            map.put(nums[i], i);
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
