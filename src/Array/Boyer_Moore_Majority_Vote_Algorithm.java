/*
 * In this program we have to check which element is present more that array.length/2 times
 * 
 * Also Called As Majority Element
 */

package Array;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Boyer_Moore_Majority_Vote_Algorithm {
	
	public static void main(String[] args) {
		
		int arr [] = {1,1,3,4,1,} ;
		
		int max = arr.length/2 ;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>() ;
		
		for(int i : arr) {
			
			if (map.containsKey(i)) {
				map.put(i, map.get(i)+1) ;
			}else {
				map.put(i, 1) ;
			}
		}
		
		Set<Entry<Integer, Integer>> set = map.entrySet() ;
		
		for(Entry<Integer, Integer> entry : set) {
			if(entry.getValue()> max) System.out.println(entry.getKey());
		}
	}
}
