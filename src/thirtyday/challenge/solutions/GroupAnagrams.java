package thirtyday.challenge.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupAnagrams {

  public static void main(String[] args) {
    String[] strs = {"eat","tea","tan","ate","nat","bat"};

    groupAnagrams(strs);
  }

  public static List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> result = new ArrayList<List<String>>();

    Map<String, Set<Integer>> anagramMap = new HashMap<String, Set<Integer>>();

    for(int i=0; i<strs.length; i++) {

      char [] c = strs[i].toCharArray();

      Arrays.sort(c);

      if(!anagramMap.containsKey(String.valueOf(c))) {
        Set<Integer> s = new HashSet<>();
        s.add(i);
        anagramMap.put(String.valueOf(c), s);
      } else {
        Set<Integer> set = anagramMap.get(String.valueOf(c));
        set.add(i);
        anagramMap.put(String.valueOf(c), set);
      }
    }

    for(String key: anagramMap.keySet()) {
      Set<Integer> set = anagramMap.get(key);

      List<String> subList = new ArrayList<>();
      for(int i: set){
        subList.add(strs[i]);

      }
      result.add(subList);
    }

    return result;
  }
}
