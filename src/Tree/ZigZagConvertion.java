package Tree;

public class ZigZagConvertion {
	
	    public static String convert(String s, int numRows) {
	       String[] str = new String[numRows];
			for (int i = 0; i < str.length; i++) {
				str[i] = "";
			}
			int i = 0, j = numRows - 2;
			for (int k = 0; k < s.length(); k++) {
				if (i < numRows) {
					str[i] = str[i] + s.charAt(k);
					i++;
					continue;
				} else if (j > 0) {
					str[j] = str[j] + s.charAt(k);
					j--;
				}
				else {
					i = 0;
					j = numRows - 2;
					k--;
				}

			}                       

			String conv = "";
			for (int m = 0; m < str.length; m++) {
				conv += str[m];
			}
			return conv;
	    }
	    
	    public static void main(String[] args) {
			
	    	String s = "PAYPALISHIRING" ;
	    	
	    	System.out.println(convert(s, 3) );
		}
}
