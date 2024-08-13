package Array;
/*
 * Leetcode Problem 11 
 */
public class Container_With_Most_Water {
	
	public static void main(String[] args) {
		
		int height [] = {2,1,1} ;
		
		int max = 0;
		
		for (int i = 0; i < height.length; i++) {
			
			if(height[i] > height[max]) max = i ;
		
		}
		
		int maxValue = 0, idx = max, count = 0;
		
		while(idx < height.length) {
			
			int curValue = count * height[idx] ;
			
			if(curValue > maxValue) maxValue = curValue ;

			idx++ ;
			count++ ;
		}
		
		System.out.println(maxValue);
	}
	
}
