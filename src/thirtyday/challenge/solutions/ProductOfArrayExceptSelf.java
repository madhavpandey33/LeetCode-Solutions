package thirtyday.challenge.solutions;

/**
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3300/
 */
public class ProductOfArrayExceptSelf {

  public static void main(String[] args) {
    int [] nums = {1,2,3,4};
    int result [] = productExceptSelf(nums);

    for(int i : result) {
      System.out.println(i);
    }
  }

  public static int[] productExceptSelf(int[] nums) {

    int[] leftProduct = new int[nums.length];
    int[] rightProduct = new int[nums.length];

    int [] result = new int[nums.length];

    leftProduct[0] = rightProduct[nums.length -1] =1;

    for(int leftCounter =1; leftCounter<nums.length; leftCounter++) {
      leftProduct[leftCounter] = leftProduct[leftCounter - 1] * nums[leftCounter - 1];
    }

    for(int rightCounter =nums.length -2; rightCounter>=0; rightCounter--) {
      rightProduct[rightCounter] = rightProduct[rightCounter + 1] * nums[rightCounter + 1];
    }

    for(int i=0; i< nums.length; i++) {
      result[i] = leftProduct[i] * rightProduct[i];
    }
    return  result;
  }
}
