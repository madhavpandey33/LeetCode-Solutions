package thirtyday.challenge.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3289/
 */
public class CountingElements {

  public static void main(String[] args) {
    int arr[] = {1,1,2,2};

    System.out.println(countElements(arr));
  }

  public static int countElements(int[] arr) {
    int count = 0;
    if(arr.length > 0) {

      Set<Integer> set = new HashSet<>();

      for(int i =0; i< arr.length; i++){
        set.add(arr[i]);
      }

      for(int i =0; i< arr.length; i++){
        if(set.contains(arr[i] + 1)){
          count += 1;
        }
      }
    }
    return count;
  }
}
