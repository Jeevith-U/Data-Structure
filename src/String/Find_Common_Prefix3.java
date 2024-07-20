package String;

public class Find_Common_Prefix3 {
	
	public static void main(String[] args) {
		
		String [] strs = {"flower","flow","flight"} ;
		
		if(strs == null || strs.length == 0) {
			System.out.println("The Array is Empty");
		}
		
		String prefix = "" ;
		
		for(int i = 0 ; i < strs.length-2 ; i++) {
			
			int idx = 0 ;
			
			try {
			
			if(strs[i].charAt(idx) == strs[i+1].charAt(idx)) {
				
				while (strs[i].charAt(idx) == strs[i+1].charAt(idx)) {
					
					prefix += strs[i].charAt(idx) ;
					idx++ ;
				}
				
			}

			}catch (Exception e) {
			}
		
		System.out.println(prefix);
	}
	}
}
