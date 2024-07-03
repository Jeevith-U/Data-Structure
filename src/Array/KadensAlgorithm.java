package Array;

public class KadensAlgorithm {
	
	public static void main(String[] args) {
		
		int arr [] = {-5, 4, 6, -3, 4, -1};
		
		int max = 0 , curMax = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			curMax = curMax + arr[i] ;
			
			if(curMax > max) max = curMax ;
			
			if(curMax < 0) curMax = 0 ;
			
		}
		
		System.out.println(max);
	}
}
