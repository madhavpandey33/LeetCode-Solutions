package easy.solutions;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

  public static void main(String[] args) {
    int n = 19;
    System.out.println("n "+n+" is a  happy number: "+isHappy(n));
  }

  public static boolean isHappy(int n) {

    Set<Integer> uniqueSet =  new HashSet<>();

    boolean result = false;

    if(n==1) {
      result = true;
    } else {
      while(n>1) {
        int currentSum = getSum(n);
        if(currentSum == 1) {
          n = currentSum;
          result =  true;
        } else {
          if(uniqueSet.contains(currentSum)){
            result = false;
            n = 1;
          } else {
            uniqueSet.add(currentSum);
            n = currentSum;
          }
        }
      }
    }
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