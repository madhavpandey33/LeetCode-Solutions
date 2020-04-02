package thirtyday.challenge.solutions;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

  public static void main(String[] args) {
    int [] nums = {2,2,1};
    singleNumber(nums);
  }

  public static int singleNumber(int[] nums) {

    int result = 0;

    Set<Integer> set = new HashSet<Integer>();
    set.add(nums[0]);
    for(int i =1; i <nums.length; i++) {
      if(set.add(nums[i]) == true) {
        continue;
      } else {
        set.remove(nums[i]);
      }
    }

    result = set.iterator().next();

    return result;
  }
}
