package Heap;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Jeevith
 * to insert a element to the heap we don't insert it the top
 * We Insert the element at the leaf keeping entire structure as a heap
 * then w'll compare the new insert element with the parent
 * if the insert element is greater than the parent then w'll swap else w'll move on
 */

public class InsertElementToHeap {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> heapArr = new ArrayList<>(Arrays.asList(50, 40, 30, 10, 5, 20, 15));
		 
		 insertEleToHeap(heapArr, 45) ;
	}

	public static void insertEleToHeap(ArrayList<Integer> heapArr, int ele) {
		
		heapArr.add(ele) ;
		
		int len = heapArr.size()-1 ;
		
		int idx = len ;
		
		while(idx > 1) {
			
			int parent = idx / 2 ;
			
			if(heapArr.get(parent) < heapArr.get(idx)) {
				int temp = heapArr.get(parent) ;
				heapArr.set(parent, heapArr.get(idx)) ;
				heapArr.set(idx, temp) ;
				idx = parent ;
			}else return ;
		}
		
		System.out.println(heapArr);
	}
}


