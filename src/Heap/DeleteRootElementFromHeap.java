package Heap;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Jeevith
 * 
 *         This program demonstrates how to insert an element into a Max-Heap.
 * 
 *         Max-Heap Properties: - The value of each node is greater than or
 *         equal to the values of its children. - The highest value is at the
 *         root of the heap.
 * 
 *         Insertion Strategy: 1. Insert the new element at the end of the heap
 *         (as a leaf node). 2. Compare the newly added element with its parent.
 *         3. If the new element is greater than its parent, swap them. 4.
 *         Continue comparing and swapping until the heap property is restored.
 *         (This is known as "Heapify Up" or "Percolate Up" operation).
 * 
 *         Edge Cases to Consider: 
 *         1.Empty Heap: The array is empty or has only one element. 
 *         2.Single Element Heap: Deleting the root leaves the heap
 *         3.Complete Tree Structure: Maintain the complete tree property
 *         4.Boundary Indexing: Avoid wwArrayIndexOutOfBoundsException.
 * 
 */

public class DeleteRootElementFromHeap {

	public static void main(String[] args) {

		int arr[] = { 50, 40, 30, 10, 5, 20, 15 };
		int heapSize = arr.length;

		System.out.println("Before Deletion: " + Arrays.toString(arr));

		heapSize = deleteRootElement(arr, heapSize);

		System.out.print("After Deletion: ");
		for (int i = 0; i < heapSize; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int deleteRootElement(int[] arr, int heapSize) {

		if (heapSize == 0) {
			System.out.println("Heap is empty. Cannot delete.");
			return heapSize;
		}

		if (heapSize == 1) {
			return --heapSize;
		}

		arr[0] = arr[heapSize - 1];

		heapSize--;

		int idx = 0;

		while (true) {
			int leftIdx = (2 * idx) + 1;
			int rightIdx = (2 * idx) + 2;
			int largest = idx;

			if (leftIdx < heapSize && arr[leftIdx] > arr[largest]) {
				largest = leftIdx;
			}

			if (rightIdx < heapSize && arr[rightIdx] > arr[largest]) {
				largest = rightIdx;
			}

			if (largest == idx) {
				break;
			}

			int temp = arr[largest];
			arr[largest] = arr[idx];
			arr[idx] = temp;

			idx = largest;
		}

		return heapSize;
	}
}

/*
 * 
 * Replace the Root with the Last Element:
 * 
 * Copy the last element to the root and reduce the heap size by 1. Heapify
 * Down:
 * 
 * Start at the root and compare with its children. Swap with the largest child
 * to maintain the Max-Heap property. Continue until the heap property is
 * restored or you reach a leaf node. Array Size Adjustment:
 * 
 * Use an ArrayList to easily adjust the size after deletion.
 */
