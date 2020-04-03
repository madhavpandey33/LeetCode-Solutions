package easy.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * It is just a more clean solution to one the available in HappyNumber class
 */
public class HappyNumber2 {

  public static void main(String[] args) {
    int n = 19;
    System.out.println("Number "+n+" is a  happy number: "+isHappy(n));
  }

  public static boolean isHappy(int n) {

    Set<Integer> uniqueSet =  new HashSet<>();

    boolean result = false;

    while(n != 1 && !uniqueSet.contains(n)) {
      uniqueSet.add(n);
      n = getSum(n);
    }

    if(n==1) result = true;

    return result;
  }


  public static int getSum(int n) {
    int currentSum =  0;

    while(n>0){
      currentSum += (int) Math.pow(n%10, 2);
      n = n/10;
    }

    return currentSum;
  }
}