package markAndToys;

import java.util.Arrays;

public class MarkAndToys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] prices = {1, 12, 5, 111, 200, 1000, 10};
		int[] prices2 = {1, 2, 3, 4};
		System.out.println(maximumToys(prices2, 7));
	}
	
	static int maximumToys(int[] prices, int k) {
		Arrays.sort(prices);
		int moneySpent = 0;
		int toysBought = 0;
		for(int i = 0; i < prices.length; i++) {
			if(k >= moneySpent) {
				moneySpent += prices[i];
				k -= moneySpent;
				toysBought++;
			}
		}
		return toysBought;
    }
}	
