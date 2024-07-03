package Array;

public class StockBuyAndSell2 {

	public static void main(String[] args) {

		int stocks[] = { 3, 2, 4, 9, 5, 1, 23 };

		System.out.println("The Profit I can get is : " + calculateProfit(stocks));
	}

	private static int calculateProfit(int[] stocks) {
		
		int maxProfit = 0 ;
		
		int min = stocks[0] ;
		
		for (int i = 0; i < stocks.length; i++) {
			
			min = Math.min(stocks[i], min) ;
			
			int curMax = stocks[i] - min ;
			
			maxProfit = Math.max(maxProfit, curMax) ;
		}
		
		return maxProfit ;
	}

}
