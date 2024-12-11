package Recursion;

/**
 * @author Jeevith
 * In this program we are given with the matrix of n x m 
 * we will be starting form a point and we have to reach a point 
 * we have figure out number of ways to reach a point b from point a
 *
 */

public class NxM_Matrix {
	
	public static void main(String[] args) {
		
		int ways = findWay(4, 4) ;
		
		System.out.println(ways);
	}

	/**
	 * 
	 * @param int n
	 * @param int m
	 * @return int value indicates sum of ways
	 */
	public static int findWay(int n, int m) {
		
		if( n == 1 || m == 1) return 1 ;
		
		return findWay(n-1, m) + findWay(n, m-1) ;
	}
}


