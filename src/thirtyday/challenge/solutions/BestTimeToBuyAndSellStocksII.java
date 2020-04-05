package thirtyday.challenge.solutions;

public class BestTimeToBuyAndSellStocksII {

  public static void main(String[] args) {
    int prices[] = {7,1,5,3,6,4};

    System.out.println(maxProfit(prices));
  }

  public static int maxProfit(int[] prices) {

    int result = 0;

    if(prices.length > 1){
      int[] diff = new int[prices.length -1];

      for(int i=0; i<prices.length-1; i++) {
        diff[i] = prices[i+1] - prices[i];
      }

      result = diff[0];

      for(int i = 1; i<diff.length; i++) {
        if(result + diff[i] < diff[i]){
          result = diff[i];
        } else if(result + diff[i] > result) {
          result += diff[i];
        }

      }

      if(result < 0){
        result = 0;
      }
    }
    return result;
  }

}
