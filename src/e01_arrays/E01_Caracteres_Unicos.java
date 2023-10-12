package e01_arrays;

import java.util.HashSet;
import java.util.Set;

public class E01_Caracteres_Unicos {
  
  public static void main(String[] args) {
    System.out.println(isUnique("abcdef"));
    System.out.println(isUnique("abcdedf"));
  }
  
  public static boolean isUnique(String s) {
    if (s.length() > 128) return false;
    
    Set<Character> set = new HashSet<>();
    
//    for (int i = 0; i < s.length(); i++) {
//      if (!set.add(s.charAt(i))) return false;
//    }
    
    
    char[] array = s.toCharArray();
    
    for (char c : array) {
      if (!set.add(c)) return false;
    }
    
    
    
    return true;
  }

}
