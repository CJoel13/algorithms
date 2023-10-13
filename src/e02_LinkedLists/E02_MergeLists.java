package e02_LinkedLists;

public class E02_MergeLists {
  
  public static void main(String[] args) {
    int[] a1 = {1,2,4,6};
    int[] a2 = {2,3,5};
    
    Node l1 = Node.retrieveNodes(a1);
    Node l2 = Node.retrieveNodes(a2);
    Node.printList(l1);
    Node.printList(l2);
    
    Node.printList(merge(l1, l2));
    
    
  }
  
  public static Node merge(Node l1, Node l2) {
    Node aux = l1;
    
    /**
     * First is <
     */
    if (l1.getValue() > l2.getValue()) {
      Node newNode = new Node(l2.getValue());
      newNode.setNext(l1);
      aux = newNode;
    }
    
    Node prev = l1;
    Node curr = l1.getNext();
    
    Node iter2 = l2;
    
    while (curr != null && iter2 != null) {
      if (prev.getValue() <= iter2.getValue() && curr.getValue() >= iter2.getValue()) {
        Node toInsert = new Node(iter2.getValue());
        prev.setNext(toInsert);
        toInsert.setNext(curr);
        
        prev = prev.getNext();
        curr = toInsert;
        
        iter2 = iter2.getNext();
      } else {
        prev = curr;
        curr = prev.getNext();
      }
    }
    
    if (iter2 != null) {
      curr.setNext(iter2);
    }
    
    return aux;
  }
  
  

}
