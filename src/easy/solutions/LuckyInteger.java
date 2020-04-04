package easy.solutions;

import java.util.HashMap;
import java.util.Map;

public class LuckyInteger {

  public static void main(String[] args) {
    int arr[] = {2,2,3,3,3};

    System.out.println(findLucky(arr));
  }


  public static int findLucky(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();

    int result = -1;

    for(int i=0; i<arr.length; i++) {
      if(!map.containsKey(arr[i])){
        map.put(arr[i], 1);
      } else {
        map.put(arr[i], map.get(arr[i]) + 1);
      }
    }

    for(int i : map.keySet()) {
      int value = map.get(i);

      if(value == i && result < i){
        result = i;
      }
    }

    return  result;

  }

}
