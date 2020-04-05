package easy.solutions;

/**
 * This solution is a more clean solution to the one present in BestTimeToBuyAndSellStocksII class
 */

public class BestTimeToBuyAndSellStocksII2 {

  public static void main(String[] args) {
    int prices[] = {};

    System.out.println(maxProfit(prices));
  }

  /**
   * the approach taken is very logical, we only want to consider profit not loss (between 2 consecutive days)
   * @param prices
   * @return
   */
  public static int maxProfit(int[] prices) {

    int maxProfit = 0;

    for(int i =1; i<prices.length;i++) {
      if(prices[i] > prices[i-1]){
        maxProfit += prices[i] - prices[i-1];
      }
    }

    return maxProfit;
  }

}