package markAndToys;

import java.util.Arrays;

public class MarkAndToys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] prices = {1, 12, 5, 111, 200, 1000, 10};
		int[] prices2 = {33324560, 77661073, 31948330, 21522343, 97176507, 5724692, 24699815, 12079402, 6479353, 28430129, 42427721, 57127004, 26256001, 29446837, 65107604, 9809008, 65846182, 8470661, 13597655, 360};
		System.out.println(maximumToys(prices2, 10000));
	}
	
	static int maximumToys(int[] prices, int k) {
		Arrays.sort(prices);
		int moneySpent = 0;
		int toysBought = 0;
		//System.out.println(k);
		for(int i = 0; i < prices.length; i++) {
			if(k >= prices[i]) {
				k = k - prices[i];
				toysBought++;
			}
		}
		//System.out.println(k);
		//for(int e : prices) 
		//	System.out.print(e + " ");
		return toysBought;
    }
}	
