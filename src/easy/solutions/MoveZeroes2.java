package easy.solutions;

/**
 * This solution uses a 2 pointer approach where first we are
 * bringing all the non zeroes element in the beginning on the array and
 * then appending zeroes at the back
 */
public class MoveZeroes2 {

  public static void main(String[] args) {
    int nums[] = {0,1,0,3,12};

    moveZeroes(nums);
  }


  public static void moveZeroes(int[] nums) {

    int latestNonZeroEleIndex = 0;

    for(int i=0; i<nums.length; i++) {
      if(nums[i] !=0){
        nums[latestNonZeroEleIndex] = nums[i];
        latestNonZeroEleIndex++;
      }
    }

    for(int i = latestNonZeroEleIndex; i<nums.length; i++) {
      nums[i] = 0;
    }
  }
}
