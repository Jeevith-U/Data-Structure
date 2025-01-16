package Array;

public class AdvanceBinarySearchInRotatedArray {

    public static void main(String[] args) {

        int arr[] = {20, 30, 80, 60, 70, 90, 110};

        advanceBinarySearch(arr, 30);
    }

    public static void advanceBinarySearch(int[] arr, int key) {

        int start = 0, end = arr.length - 1;

        boolean flag = false;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                flag = true;
                break;
            }

            if (arr[start] <= arr[mid]) { // Left half is sorted
                if (key >= arr[start] && key < arr[mid]) {
                    end = mid - 1; // Key is in the left sorted half
                } else {
                    start = mid + 1; // Key is in the right half
                }
            } else { // Right half is sorted
                if (key > arr[mid] && key <= arr[end]) {
                    start = mid + 1; // Key is in the right sorted half
                } else {
                    end = mid - 1; // Key is in the left half
                }
            }
        }

        if (flag)
            System.out.println("Element found in the Array.");
        else System.out.println("Element Not Found In the Array");
    }
}
