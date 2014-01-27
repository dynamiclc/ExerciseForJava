package problem.twosum;

import java.util.*;

public class TwoSum {
  public static int[] twoSum(int[] numbers, int target) {
    Map<Integer, Integer> m = new HashMap<Integer, Integer>();
    int n = numbers.length; // count of all numbers 
    int[] result = new int[2];
    
    for (int i = 0; i < n; i++) {
      if (m.isEmpty()) { // if m is empty
        m.put(numbers[i], i);
      } else { // if m is not empty        
        Integer key = new Integer(target - numbers[i]); // key is the subscript of the number that is complement to the 
        Integer key2 = new Integer(numbers[i]); // key2 is the subscript of number currently
        if (m.containsKey(key)){
          result[0] = m.get(key).intValue() + 1;
          System.out.println("index1=" + result[0]);          
          result[1] = i + 1;
          System.out.println("index2=" + result[1]);
          break;
        } else if (!m.containsKey(key2)) {
          m.put(key2,i);
        } else{          
        }
      }
    }
    return result;
  }
}

//public int[] twoSum(int[] numbers, int target) {  
//    // Start typing your Java solution below  
//    // DO NOT write main() function  
//    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();  
//    int n = numbers.length;  
//    int[] result = new int[2];  
//    for (int i = 0; i < numbers.length; i++)  
//    {  
//        if (map.containsKey(target - numbers[i]))  
//        {  
//            result[0] = map.get(target-numbers[i]) + 1;  
//            result[1] = i + 1;  
//            break;  
//        }  
//        else  
//        {  
//            map.put(numbers[i], i);  
//        }  
//    }  
//    return result;  
//      
//}  
