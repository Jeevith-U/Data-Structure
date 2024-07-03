package Recursion;

public class TowerOfHanoi {
	
	public static void main(String[] args) {
		
		int disk = 3 ;
		
		hanoi(disk, "src", "helper","destination" ) ;
	}

	private static void hanoi(int disk, String source, String helper, String destination) {
		
		if(disk == 1) {
			System.out.println("Transferd disk "+disk+" from "+source+" destination ");
			return ;
		}
		
		hanoi(disk-1, source, destination, helper);
		System.out.println("Transferd disk "+disk+" from "+source+" destination ");
		hanoi(disk-1, helper, source, destination);
	}
	
}
