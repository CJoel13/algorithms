package e02_LinkedLists;

import java.util.HashSet;
import java.util.Set;

public class E01_DeleteDuplicates {
  
  public static void main(String[] args) {
    
    int[] array = {1,2,3,4,4,5,6,7,2,7};
    Node head = Node.retrieveNodes(array);
    Node.printList(head);
    Node.printList(removeDups(head));
    
    
    
    
  }
  
  public static Node removeDups(Node head) {
    Node aux = head;
    
    Set<Integer> set = new HashSet<>();
    
    /*
     * Solo un nodo
     */
    if (head.getNext() == null) return head;
    
    set.add(head.getValue());
    Node prev = head;
    Node curr = head.getNext();
    
    
    while (curr != null) {
      if (set.add(curr.getValue())) {
        prev = prev.getNext();
        curr = curr.getNext();
      } else {
        prev.setNext(curr.getNext());
        curr = curr.getNext();
      }
    }
    
    return aux;
  }

}
