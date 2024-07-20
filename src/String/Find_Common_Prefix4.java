package String;

public class Find_Common_Prefix4 {
	
	public static void main(String[] args) {
		
		String [] strs = {"jeevith","jeer","jejdbc"} ;
		
		String prefix = strs[0] ;
		
		if(strs == null || strs.length == 0) System.out.println("The Array is Empty");
		
		for(int i = 1 ; i < strs.length ; i++) {
			
			while(strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length()-1) ;
				System.out.println(prefix);
			}
		}
		
		System.out.println(prefix);
	}
}
