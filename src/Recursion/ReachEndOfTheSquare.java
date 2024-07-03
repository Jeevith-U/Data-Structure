
/*
 * from the starting of the square u have to reach the end of the square
 * You can go only right and down
 * somehow if reach last column u are left with 1 down
 * somehow if reach last row u are left with 1 right run
 * 
 */


package Recursion;

public class ReachEndOfTheSquare {
	
	public static void main(String[] args) {
		
		int ans = square(2, 4) ;
		
		System.out.println(ans);
	}

	public static int square(int i, int j) {
		
		if(i == 1 || j ==1) return 1 ;
		
		return square(i-1, j)+square(i, j-1);
	}
}
