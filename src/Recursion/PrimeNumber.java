package Recursion;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		for(int i = 1 ; i < 1000 ; i++) {
			
			int num = i ;
			
			boolean flag = true ;
			
			for (int j = 2; j < num ; j++) {
				
				if( num % j == 0) {
					flag = false ;
				}
			}
			
			if(flag == true) {
				System.out.println(i);
			}
				
			}
				
		}
}
