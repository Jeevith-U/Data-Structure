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
 *         1.Empty Heap: The array is empty or has only
 *         one element. 
 *         2.Single Element Heap: Deleting the root leaves the heap
 *         empty. 
 *         3.Complete Tree Structure: Maintain the complete tree property
 *         after deletion. 
 *         4.Boundary Indexing: Avoid
 *         ArrayIndexOutOfBoundsException.
 * 
 */

public class DeleteRootElementFromHeap2 {

    public static void main(String[] args) {
        
        // Initialize the heap as an array
        int arr[] = {50, 40, 30, 10, 5, 20, 15};
        int heapSize = arr.length;
        
        System.out.println("Before Deletion: " + Arrays.toString(arr));
        
        // Delete root element
        heapSize = deleteRootElement(arr, heapSize);
        
        // Display the heap after deletion
        System.out.print("After Deletion: ");
        for (int i = 0; i < heapSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int deleteRootElement(int[] arr, int heapSize) {
        
        // Edge Case: If heap is empty
        if (heapSize == 0) {
            System.out.println("Heap is empty. Cannot delete.");
            return heapSize;
        }
        
        // Edge Case: If heap has only one element
        if (heapSize == 1) {
            return --heapSize;
        }
        
        // Step 1: Replace root with the last element
        arr[0] = arr[heapSize - 1];
        
        // Step 2: Reduce the size of the heap
        heapSize--;
        
        // Step 3: Heapify Down
        int idx = 0;
        
        while (true) {
            int leftIdx = (2 * idx) + 1;
            int rightIdx = (2 * idx) + 2;
            int largest = idx;
            
            // Check if left child is within bounds and greater than the current node
            if (leftIdx < heapSize && arr[leftIdx] > arr[largest]) {
                largest = leftIdx;
            }
            
            // Check if right child is within bounds and greater than the current largest
            if (rightIdx < heapSize && arr[rightIdx] > arr[largest]) {
                largest = rightIdx;
            }
            
            // If largest is still the current index, the heap property is restored
            if (largest == idx) {
                break;
            }
            
            // Swap the current node with the largest child
            int temp = arr[largest];
            arr[largest] = arr[idx];
            arr[idx] = temp;
            
            // Move down to the next level
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
