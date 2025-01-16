package Array;

import java.util.Arrays;

/**
 * @author Jeevith
 *
 */

public class AllocateMinimumPages {

    public static void main(String[] args) {

        int arr [] = {10, 10, 20, 30} ;

        int sol = allocateMinimumPage(arr, 2);

        System.out.println(sol);
    }

    public static int allocateMinimumPage(int[] arr, int k) {

        int min = maxElement(arr) ;

        int max = sumOfArr(arr) ;

        int res = 0 ;

        while(min <= max){

            int mid = (min + max) / 2 ;

            if(isFeasible(arr, k, mid)){

                res = mid ;

                max = mid - 1 ;

            }else {
                min = mid + 1 ;
            }

        }

        return  res ;
                
    }

    private static boolean isFeasible(int[] arr, int k, int res) {

        int student = 1 , sum = 0 ;

        for (int i = 0; i < arr.length; i++){

            if(sum + arr[i] > res){
                student++ ;
                sum = arr[i] ;
            }else {
                sum += arr[i] ;
            }
        }
        return  student <= k ;
    }

    public static int sumOfArr(int[] arr) {

        return Arrays.stream(arr).sum() ;
    }

    public static int maxElement(int[] arr) {
        return Arrays.stream(arr).max().orElseThrow(() -> new RuntimeException()) ;
    }
}


