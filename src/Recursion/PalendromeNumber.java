package Recursion;

public class PalendromeNumber {
	
	public static void main(String[] args) {
		
		int num  = 232 ;
		
		int orgNum = num ;
		
		int palNum = 0 ;
		
		while(num > 0) {
			
			int rem  = num % 10 ;
			
			palNum = palNum * 10 + rem ;
			
			num = num / 10 ;
		}
		
		if(orgNum == palNum)
			System.out.println("Enterd Number is Palendrome Number");
		else
			System.out.println("Enterd Number Is not a Palendrome Number");
			
	}
}
