package Array;

public class KadensAlgorithemForNegativeArray {
	
	public static void main(String[] args) {
		
		int arr [] = {-15, -24, -16, -3, -9, -10};
		
		int max = arr[0] , curMax = arr[0];
		int start = 0, end = 0, tempStart = 0;

		for (int i = 1; i < arr.length; i++) {
			
			curMax = curMax + arr[i] ;
			
			if(curMax > max){
				max = curMax ;
				start = tempStart ;
				end = i ;
			}

			if (curMax < 0) {
				curMax = 0;
				tempStart = i + 1;
			}
		}
		System.out.println(max);
	}
}
