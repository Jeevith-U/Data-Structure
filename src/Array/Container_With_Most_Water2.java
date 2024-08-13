package Array;
/*
 * Leetcode Problem 11 
 */
public class Container_With_Most_Water2 {
	
	public static void main(String[] args) {
		
		int height [] = {1,8,6,2,5,4,8,3,7} ;
		
		int maxValue = 0, max = 0 ;
		
		for (int i = 0; i < height.length; i++) {
			
			int cur = i * height[i] ;
			
			if(max < height[i] && cur > maxValue) {
				maxValue = cur ;
				max = height[i] ;
			}
		}
		System.out.println(max);
	}
}
