package Array;

import java.util.Arrays;

/*
 * In this way we will get in O(n) time and O(n) space
 */

public class StockBuyAndSell1 {
	
	public static void main(String[] args) {
		
		int stocks [] = {3, 2 ,4, 9, 5, 2, 1} ;
		
		System.out.println("The Profit I can get is : "+calculateProfit(stocks));
	}

	private static int calculateProfit(int[] stocks) {
		int profit = 0 ;
		
		int feature [] = new int [stocks.length] ;
		
		feature[stocks.length-1] = stocks[stocks.length-1] ;
		
		for (int i = feature.length-2; i >= 0 ; i--) {
			
			feature[i] = Math.max(feature[i+1], stocks[i])  ;
		}
		
		System.out.println(Arrays.toString(feature));
		
		for (int i = 0; i < feature.length; i++) {
			
			int curProfit = feature[i] -  stocks[i] ;
			
			profit = Math.max(curProfit, profit) ;
		}
		
		return profit;
	}
}
