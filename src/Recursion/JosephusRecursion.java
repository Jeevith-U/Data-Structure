package Recursion;

public class JosephusRecursion {
	
	public static void main(String[] args) {
		
		System.out.println(findSurvivor(10, 3) );
	}

	private static int findSurvivor(int people, int k) {
		
		if(people == 1 ) return people ;
		
		return (findSurvivor(people-1, k)+k)%people ;
	}
}
