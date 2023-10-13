package e01_arrays;

import java.util.Arrays;

public class T01_Array {
  
  public static void main(String[] args) {
    int[] array = new int[5];
    
    System.out.println(Arrays.toString(array));
    
//    array[3]++;
    System.out.println(Arrays.toString(array));
    
    int[] array2 = new int[5];
    array[0]--;
    
    boolean isAnagram = true;
    for (int value : array) {
      if (value != 0) {
        isAnagram = false;
      }
    }
    System.out.println((Arrays.mismatch(array, array2)) < 0 ? "Anagram!" : "Not anagram");
    System.out.println(isAnagram ? "Anagram!" : "Not anagram");
  }

}
