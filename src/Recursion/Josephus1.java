package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Josephus1 {
	
	public static void main(String[] args) {
		
		int arr [] = {0,1, 2,3,4} ;
		
		int k = 3 ;
		
		System.out.println("The Survivor is : "+findSolution(arr, k));
	}

	private static int findSolution(int[] arr, int k) {
		
		List<Integer> people =new ArrayList<Integer>() ;
		
		for(Integer i : arr) people.add(i) ;
		
		int idx = 0 ;
		
		while (people.size() > 1) {
			
			idx = (idx + k -1) % people.size() ;
			
			people.remove(idx) ;
		}
		
		return people.get(0) ;
		
	}
}
