package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Jeevith
 *
 */

public class Main {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Enter the NAme");
		Employee employee1 = new Employee(scan.next(), scan.nextInt()) ;
		employee1.display() ;
		
		Employee employee2 = (Employee)employee1.clone() ;

		employee2.display();
		
		System.out.println("Enter the Name for EMployee 2");
		
		employee2.name = scan.next() ;
		
		System.out.println("EMployee2 Updated");
		employee2.display();
		
		System.out.println();
		System.out.println("EMployee1");
		employee1.display();
	}
}


