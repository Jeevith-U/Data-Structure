package Algos;

import java.util.Vector;

public class MergeSort2 {

    public int[] sortArray(int[] nums) {
        return divide(nums, 0, nums.length - 1);
    }

    public static int[] divide(int arr[], int start, int end) {
        // Base case: when there's only one element, it's already sorted
        if (start >= end) {
            return new int[] { arr[start] };
        }

        int mid = start + (end - start) / 2;

        // Correct the recursive calls by using the actual start and end indices
        int[] leftArray = divide(arr, start, mid); // left part
        int[] rightArray = divide(arr, mid + 1, end); // right part

        // Merge the sorted left and right parts
        return mergeArray(leftArray, rightArray);
    }

    public static int[] mergeArray(int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;

        int[] mergedArray = new int[leftArray.length + rightArray.length];

        // Merge the two sorted arrays
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                mergedArray[k] = leftArray[i];
                i++;
            } else {
                mergedArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from leftArray
        while (i < leftArray.length) {
            mergedArray[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy any remaining elements from rightArray
        while (j < rightArray.length) {
            mergedArray[k] = rightArray[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}
