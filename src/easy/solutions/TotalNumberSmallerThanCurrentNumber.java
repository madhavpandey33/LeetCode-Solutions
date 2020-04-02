package easy.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TotalNumberSmallerThanCurrentNumber {

  public static void main(String[] args) {
    int [] nums = {8,1,2,2,3};
    smallerNumbersThanCurrent(nums);
  }

  public static int[] smallerNumbersThanCurrent(int[] nums) {

    List<Integer> listOfNumbers = new ArrayList<>();
    int result [] = new int[nums.length];

    for (int i : nums) {
      listOfNumbers.add(i);
    }

    Arrays.sort(nums);
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int i = 0; i < nums.length; i++) {
      if(!map.containsKey(nums[i])) {
        map.put(nums[i], i);
      }
    }

    for(int i = 0; i<listOfNumbers.size(); i++) {
      result[i] = map.get(listOfNumbers.get(i));
    }

    return result;
  }


}