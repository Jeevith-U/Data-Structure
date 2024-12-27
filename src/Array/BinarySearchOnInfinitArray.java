package Array;

/**
 * @author Jeevith
 *
 */

public class BinarySearchOnInfinitArray {
	
	public static void main(String[] args) {
		
		int arr [] = {7, 12, 19, 22, 28, 34, 36, 42, 44, 47, 50, 54, 59, 65} ;
		
		int key = 47 ;
		
		findRangeInInfinitArray(arr, key) ;
	}

	public static void findRangeInInfinitArray(int[] arr, int key) {
		
		int low = 0, high = 1 ;
		
		while(arr[high] < key) {
			
			low = high ;
			
			high = high * 2 ;
			
			//If the Array is Not Infinite we have to limit our High
			if (high >= arr.length) {
	            high = arr.length - 1; // Adjust range to within array bounds
	            break;
			}
		}
		
		binarySearch(key, arr, low, high) ;
	}

	public static void binarySearch(int key, int[] arr, int low, int high) {
		
		boolean flag = false ;
	
		while(low <= high) {
			
			int mid = low + (high - low) / 2 ;
			
			if(arr[mid] == key) {
				System.out.println("Found the Element at : "+mid);
				flag = true ;
				break ;
			}
			
			if(arr[mid] > key) high = mid - 1 ;
				
			else low = mid + 1 ; 
		}
		
		if(flag == false) System.out.println("Element is Not present in the Given Array");
	}
}


