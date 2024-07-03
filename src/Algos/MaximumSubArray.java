package Algos;

public class MaximumSubArray {
	
	public static void main(String[] args) {
		
		int nums [] = {5,4,-1,7,8} ;
		
		int currentSum =  0 ;
        int maxSum = 0 ;

        for(int i = 0;  i <= nums.length-1 ; i++){

           currentSum  = nums[i] ;
           
           if(nums.length == 1) {
       		System.out.println(nums[0]);
           }else {
            for(int j = i+1 ; j <= nums.length-1 ; j++){
            	
                currentSum += nums[j] ;

                if(currentSum == 0 || currentSum < 0){

                    currentSum = 0 ;
                }

                else if( currentSum > maxSum){

                    maxSum = currentSum ;
                }
            }
        }
        }
        System.out.println(maxSum);
	}
}
