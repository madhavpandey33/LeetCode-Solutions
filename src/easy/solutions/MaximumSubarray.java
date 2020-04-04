package easy.solutions;

public class MaximumSubarray {

  public static void main(String[] args) {
    int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubArray(nums));
  }

  public static int maxSubArray(int[] nums) {
    int curr_max = 0, prev_max =Integer.MIN_VALUE;

    for(int i=0; i< nums.length; i++) {
      curr_max = Math.max(nums[i], curr_max+nums[i]);

      if(curr_max > prev_max) {
        prev_max = curr_max;
      }

    }
    return Math.max(curr_max, prev_max);
  }
}
