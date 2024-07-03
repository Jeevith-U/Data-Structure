package Array;

public class StockBuyAndSell3TotalProfit {
	
	public static void main(String[] args) {
		
		int stocks [] = {5, 2, 6, 1, 4, 7, 3, 6} ;
		
		System.out.println("Total Profit is : "+findProfit(stocks));
	}

	private static int findProfit(int[] stocks) {
		
		int profit = 0 ;
		
		for (int i = 1; i < stocks.length; i++) 
		     if(stocks[i-1] > stocks[i]) 
		    	  profit += stocks[i-1] - stocks[i] ;
		return profit;
		
		
	}

}
