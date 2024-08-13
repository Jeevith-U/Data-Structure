package Array;
/*
 * Leetcode Problem 11 
 */
public class Container_With_Most_Water3 {
	
	public static void main(String[] args) {
		
		int height [] = {1} ;
		
		solution(height) ;
 	}

	public static void solution(int[] height) {
		
		int left = 0 , right = height.length-1, maxVal = 0;
		
		while (left < right) {
			
			int curMax = Math.min(height[left], height[right]) * (right - left) ;
			
			maxVal = Math.max(maxVal, curMax) ;
			
			if(height[left] < height[right]) left++ ;
			else right-- ;
		}
		
		System.out.println(maxVal);
	}
}

/*
 * 
 * class Solution {
    public int maxArea(int[] height) {
        int start = 0, ans = 0, end = height.length - 1;
        while (start < end) {
            int h=Math.min(height[start],height[end]);
            int water=(end-start)*h;
            ans=Math.max(ans,water);
            while(height[start]<=h && start<end){
                start++;
            }
            while(height[end]<=h && start<end){
                end--;
            
        }}
        return ans;
    }
}
 */
