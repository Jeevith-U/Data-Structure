package String;

public class Find_Common_Prefix2 {
	
	public static void main(String[] args) {
		
		String [] strs = {"flower","flow","flight"} ;
		
		String cs = "" ;
		
		try {
		
		boolean flag = true ;
		
		for(int  i = 0 ; i < strs[0].length() ; i++) {
			
			for(int j = 1 ; j < strs.length ; j++) {
				
				if(strs[0].charAt(i) != strs[j].charAt(i)) {
					flag = false ;
					break ;
				}
			}
			
			if(flag) cs += strs[0].charAt(i) ;
		}
		}
		catch(Exception w){

		}
		System.out.println(cs);
		
	}
}
