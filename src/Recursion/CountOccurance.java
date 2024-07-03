package Recursion;

public class CountOccurance {
	
	public static void main(String[] args) {
		
		String str = "jbcaahbswsyahnu" ;
		
		findOccurance(str, -1, -1, 0, 'a') ;
	}

	private static void findOccurance(String str, int first, int last, int idx, char c) {
		
		if(idx == str.length()-1) {
			if(str.charAt(idx) == c) {
				if(first != -1)last = idx ;return ;
			}
			System.out.println("The First Occrance is : "+first);
			System.out.println("The Last Occrance is : "+last);
			return ;
			
		}
		
		else {
			if (str.charAt(idx) == c && first == -1) 
				first = idx ;
			else
				last = idx ;
			findOccurance(str, first, last, idx+1, c);
		}
	}
}
