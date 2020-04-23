package thirtyday.challenge.solutions;

/**
 * https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/531/week-4/3308/
 */
public class BitwiseANDOfNumbersRange {

  public static void main(String[] args) {
    int start = 5;
    int end = 7;

    System.out.println(rangeBitwiseAnd(start, end));
  }

  // this approach involves right shifting bit of both start and end number until start < end and
  // doing left shift on start for that that many bit
  public static int rangeBitwiseAnd(int m, int n) {
    int count = 0;

    while(m < n) {
      m = m >> 1;
      n = n >> 1;
      count += 1;
    }

    return m << count;
  }
}
