package e01_arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class E02_TwoSum {
  
  public static void main(String[] args) {
    int[] arr1 = {9, 2, 5, 6};
    System.out.println(Arrays.toString(twoSum(arr1, 100)));
  }
  
  public static int[] twoSum(int[] array, int target) {
    
    Map<Integer, Integer> map = new HashMap<>();
    
    
    for (int i = 0; i < array.length; i++) {
      if (map.containsKey(array[i])) {
        return new int[] {map.get(array[i]), i};
      } else {
        map.put(target - array[i], i);
      }
    }
    
    return null;
  }

}
