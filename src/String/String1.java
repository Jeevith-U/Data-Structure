package String;

public class String1 {
	
	public static void main(String[] args) {
		
		 String s = "(ed(et(oc))el)" ;
		 
		 String newStr = "" ;
		 
		 int count = 0 ;
		 
		 for (int i = s.length()-1 ; i >= 0 ; i--) {
			 
			 if((s.charAt(i) == '(' || s.charAt(i) == ')') /* && count% 2 != 0*/) {
				 count++ ;
				 
				 if(count % 2 == 0) {
					 
				 }
				 continue ;
			 }
			 
//			 if( count% 2 != 0 && (s.charAt(i) != '(' || s.charAt(i) != ')')) newStr += s.charAt(i) ;
			 
			 else newStr += s.charAt(i) ;
		}
		 
		 System.out.println(newStr);
	}
}
