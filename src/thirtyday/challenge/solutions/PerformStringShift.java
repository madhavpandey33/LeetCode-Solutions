package thirtyday.challenge.solutions;

/**
 * https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/529/week-2/3299/
 */
public class PerformStringShift {

  public static void main(String[] args) {
    String s = "abcdefg";
    int[][] shift ={{0,1},{0,1},{1,2},{0,3}};

    System.out.println(stringShift(s, shift));
  }

  public static String stringShift(String s, int[][] shift) {

    StringBuilder strBldr = new StringBuilder();
    int effectiveRotation = 0;

    for(int i = 0; i<shift.length; i++) {
      effectiveRotation += shift[i][0] == 0? -shift[i][1] : + shift[i][1];
    }

    effectiveRotation = effectiveRotation % s.length();

    if(effectiveRotation > 0){
      strBldr.append(s.substring(s.length() - effectiveRotation, s.length()));
      strBldr.append(s.substring(0, s.length() -effectiveRotation));
    } else {
      strBldr.append(s.substring(- effectiveRotation, s.length() ));
      strBldr.append(s.substring(0, -effectiveRotation));
    }

    return strBldr.toString();
  }
}