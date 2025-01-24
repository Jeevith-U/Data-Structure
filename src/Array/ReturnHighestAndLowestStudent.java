package Array;

/**
 * @author Jeevith
 *
 */

public class ReturnHighestAndLowestStudent {
	
	static String students [] = {"Allen", "san", "Jeevith"} ;
	
	static int ranks []  = {2,1,3} ;
	
	public String returnHighestStudent() {
		
		int highestRank = 0 ;
		
		for(int i = 0 ; i < ranks.length ; i++) 
			
			if(ranks[i] > ranks[highestRank]) highestRank = i ;
		
		return students[highestRank] ;
	}
	
	public String returnLowestStudent() {
		
		int lowestRank = 0 ;
		
		for(int i = 0 ; i < ranks.length ; i++) 
			
			if(ranks[i] < ranks[lowestRank]) lowestRank = i ;
		
		return students[lowestRank] ;
	}
	
	public static void main(String[] args) {
		
		ReturnHighestAndLowestStudent obj = new ReturnHighestAndLowestStudent();
		
		System.out.println(obj.returnHighestStudent());
		System.out.println(obj.returnLowestStudent());
		
	}
}


