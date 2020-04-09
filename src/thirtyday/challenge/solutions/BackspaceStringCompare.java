package thirtyday.challenge.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/529/week-2/3291/
 */
public class BackspaceStringCompare {

  public static void main(String[] args) {
    String s = "ab##";
    String t = "a#c#";

    System.out.println(backspaceCompare(s,t));
  }

  public static boolean backspaceCompare(String S, String T) {

    String sList = removeBackSpace(S);
    String tList = removeBackSpace(T);

    return  sList.equals(tList);
  }

  public static String removeBackSpace(String str) {
    List<String> strList = new ArrayList<>();

    int str_currentIndex = -1;

    for(int i =0; i<str.length(); i++) {
      if(str.charAt(i) != '#'){
        strList.add(String.valueOf(str.charAt(i)));
        str_currentIndex++;
      } else {
        if(str_currentIndex <0) {
          continue;
        } else {
          strList.remove(str_currentIndex);
          str_currentIndex --;
        }
      }
    }
    return String.join("", strList);
  }

}
