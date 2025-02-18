package LeetCode;

import java.util.ArrayList;

/**
 * @author Jeevith
 *
 */

public class SubsetSumBruteForce2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>() ;
		
		list.add(10) ;
		list.add(20) ;
		list.add(30) ;
		list.add(40) ;
		list.add(50) ;
		list.add(60) ;
		list.add(70) ;
		
		System.out.println(list);
		
		System.out.println(list.remove(list.size()-1));
		
		System.out.println(list);
	}
}


