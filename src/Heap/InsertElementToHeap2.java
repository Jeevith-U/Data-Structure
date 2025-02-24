package Heap;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Jeevith
 * 
 * This program demonstrates how to insert an element into a Max-Heap.
 * 
 * Max-Heap Properties:
 * - The value of each node is greater than or equal to the values of its children.
 * - The highest value is at the root of the heap.
 * 
 * Insertion Strategy:
 * 1. Insert the new element at the end of the heap (as a leaf node).
 * 2. Compare the newly added element with its parent.
 * 3. If the new element is greater than its parent, swap them.
 * 4. Continue comparing and swapping until the heap property is restored.
 *    (This is known as "Heapify Up" or "Percolate Up" operation).
 */

public class InsertElementToHeap2 {
	
	public static void main(String[] args) {
		
		// Initialize the Max-Heap using ArrayList (Zero-based indexing)
		ArrayList<Integer> heapArr = new ArrayList<>(Arrays.asList(50, 40, 30, 10, 5, 20, 15));
		
		// Display the heap before insertion
		System.out.println("Before Insertion: " + heapArr);
		 
		// Insert a new element into the heap
		insertEleToHeap(heapArr, 45);
		
		// Display the heap after insertion
		System.out.println("After Insertion: " + heapArr);
	}

	/**
	 * This method inserts a new element into the Max-Heap and restores the heap property.
	 * 
	 * @param heapArr The ArrayList representing the Max-Heap
	 * @param ele The new element to be inserted into the heap
	 */
	public static void insertEleToHeap(ArrayList<Integer> heapArr, int ele) {
		
		// Step 1: Add the new element at the end of the heap (as the rightmost leaf)
		heapArr.add(ele);
		
		// Get the index of the newly added element
		int idx = heapArr.size() - 1;
		
		// Step 2 & 3: Heapify Up (Percolate Up)
		// Continue until we reach the root (index 0)
		while (idx > 0) {
			
			// Calculate the parent index using zero-based indexing
			// Parent Index = (Child Index - 1) / 2
			int parent = (idx - 1) / 2;
			
			// Step 4: Compare the current node with its parent
			// If the newly added element is greater than its parent, swap them
			if (heapArr.get(parent) < heapArr.get(idx)) {
				
				// Swap parent and child to maintain Max-Heap property
				int temp = heapArr.get(parent);
				heapArr.set(parent, heapArr.get(idx));
				heapArr.set(idx, temp);
				
				// Move up the tree by setting index to the parent's index
				idx = parent;
			} else {
				// If the heap property is satisfied, exit the loop
				return;
			}
		}
	}
}
