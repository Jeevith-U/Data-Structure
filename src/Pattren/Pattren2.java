package Pattren;

/**
 * @author Jeevith
 *
 */

public class Pattren2 {
	
	public static void main(String[] args) {

		int row = 7, space = 3, charcount = 1 ;
				
		for (int i = 0; i < row; i++) {
			
			char c = (char) (65+i) ;
			
			for (int j = 0; j < space; j++) {
				System.out.print(' ');
			}
			
			for (int j = 0; j < charcount; j++) {
				
				if(j > (row/2)) {
					
					c = (char) (62 + j) ;
					System.out.print(c++);
					
				}
				else
				System.out.print(c--);
			}
			
			System.out.println();
			if(i < row/2) {
				space-- ;
				charcount += 2 ;
			}
			else {
				space++ ;
				charcount -= 2 ;
			}
		}
	}
}


