package easy.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringMatchingInArray {

  public static void main(String[] args) {
    String words [] = {"leetcoder","leetcode","od","hamlet","am"};

    stringMatching(words);
  }

  public static List<String> stringMatching(String[] words) {
    List<String> result = new ArrayList<>();

    Set<String> resultSet = new HashSet<>();

    for(int i =0;i< words.length; i++){

      for(int j = 0; j<words.length;j ++) {

        if(i != j  && words[i].contains(words[j]) && !resultSet.contains(words[j])) {
          resultSet.add(words[j]);
        }
      }
    }

    for(String str : resultSet){
      result.add(str);
    }
    return result;
  }
}
