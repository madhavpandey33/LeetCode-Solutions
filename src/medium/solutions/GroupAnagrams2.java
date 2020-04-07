package medium.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This is an improved solution for Group anagram
 */
public class GroupAnagrams2 {
  public static void main(String[] args) {
    String[] strs = {"eat","tea","tan","ate","nat","bat"};

    groupAnagrams(strs);
  }

  public static List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> result = new ArrayList<List<String>>();

    Map<String, List<String>> map = new HashMap<String, List<String>>();

    for(int i=0;i<strs.length; i++) {
      char [] c = strs[i].toCharArray();

      Arrays.sort(c);

      String str = String.valueOf(c);

      map.putIfAbsent(str, new ArrayList<>());
      map.get(str).add(strs[i]);
    }

    result.addAll(map.values());

    return result;
  }
}
