/**
 * Given an array of integers, find two numbers such that they add up to a
 * specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note
 * that your returned answers (both index1 and index2) are not zero-based.
 *
 * You may assume that each input would have exactly one solution.
 *
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */

package problem.twosum;

import java.util.*;

public class TwoSum {
  public static int[] twoSum(int[] numbers, int target) {
    // 1. Initialization
    
    // 1.1 The result
    int[] result = new int[2];
    
    // 1.2 The count of numbers
    int n = numbers.length;
    
    // 1.3 The HashMap
    Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    
    // 2. Calculation

    // 2.1 Complement of the target, number value and index
    int numberComplement = 0;
    int indexComplement = 0;

    // 2.2 Loop through each element trying to find its complement
    for (int i = 0; i < n; i++) {
      numberComplement = target - numbers[i];
      if (hashMap.containsKey(numberComplement)) {
        indexComplement = hashMap.get(numberComplement);
        result[0] = indexComplement + 1;
        result[1] = i + 1;
        break;
      } else {
        hashMap.put(numbers[i], i);
      } 
    }
    
    // 3. Return
    return result;
  } // End of method twoSum()
} // End of class SolutionTwoSum
