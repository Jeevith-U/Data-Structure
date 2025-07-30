package Stack;


public class AreaOfHistogram_BrutForce {

    public static void main(String[] args) {

        int arr[] = { 4, 2, 1, 5, 6, 3, 2, 4, 2 };

        System.out.println("Max Area Of Histogram is :" + findMaxAreaofHistogram(arr));
    }

    public static int findMaxAreaofHistogram(int[] arr) {
    	
    	int maxArea = 0 ;
    	
    	for (int i = 0; i < arr.length; i++) {
			
    		int left = i , right  = i; 
    		
    		while (left > 0 && arr[left] >= arr[i]) {
				left-- ;
			}
    		
    		while (right < arr.length && arr[right] >= arr[i]) {
    			right++ ;
    		}
    		
    		int curMax = (right - left - 1) * arr[i] ;
    		
    		maxArea = Math.max(curMax, maxArea) ;
		}
    	return maxArea ;
    }
}
