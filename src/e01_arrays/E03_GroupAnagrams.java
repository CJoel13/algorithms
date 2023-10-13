package e01_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E03_GroupAnagrams {
  
  public static void main(String[] args) {
    System.out.println(groupAnagrams(new String[]{"saco", "arresto", "programa", "rastreo", "caso"}));
  }
  
  public static List<List<String>> groupAnagrams2(String[] array) {
    Map<String, List<String>> map = new HashMap<>();
    
    for (String word : array) {
//      map.containsKey
    }
    
    
    return null;
  }
  
  private static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) return false;
    
    
    int[] array = new int[128];
    for (int i = 0; i < s1.length(); i++) {
      array[s1.charAt(i)]++;
      array[s2.charAt(i)]--;
    }
    
    for (int j = 0; j < s1.length(); j++) {
      if (array[j] != 0) return false;
    }
    
    return true;
  }
  
  public static List<List<String>> groupAnagrams(String[] array) {
    
    Map<String, List<String>> map = new HashMap<>();
    /**
     * [ K      | V                 ]
     * [ abc    | {abc, bac, cab}   ]
     * [ dv     | {dv, vd}          ]
     */
    
    for (String str : array) {
      char[] word = str.toCharArray();
      Arrays.sort(word);
      String sWord = String.valueOf(word);
      
      if (map.containsKey(sWord)) {
        map.get(sWord).add(str);
      } else {
//        ArrayList<String> newList = new ArrayList<>();
        map.put(sWord, new ArrayList<String>(Arrays.asList(str)));
      }
      
    }
    List<List<String>> finalList = new ArrayList<List<String>>();
    finalList.addAll(map.values());
    return finalList; 
  }

}
