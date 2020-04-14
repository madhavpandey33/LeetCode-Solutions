package thirtyday.challenge.solutions;

import java.util.HashMap;
import java.util.Map;

/**
* https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3298/
 */
public class ContiguousArray {

  public static void main(String[] args) {
    int nums[] = {0,1};

    System.out.println(findMaxLength(nums));
  }

  public static int findMaxLength(int[] nums) {

    int sum = 0;
    int maxLength = 0;

    Map<Integer, Integer> map = new HashMap<>();
    
    for(int i=0; i<nums.length; i++) {

      sum += (nums[i] == 0 ?  -1: 1);

      if(sum == 0) {
        maxLength = Math.max(maxLength, i+1);
      }
      if(map.containsKey(sum)) {
        maxLength = Math.max(maxLength, i - map.get(sum));
      }
      map.putIfAbsent(sum, i);
    }
    return maxLength;
  }
}