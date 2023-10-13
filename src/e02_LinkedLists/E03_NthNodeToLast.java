package e02_LinkedLists;

public class E03_NthNodeToLast {
  
  public static void main(String[] args) {
    int[] a1 = {1,2,4,6};
    Node l1 = Node.retrieveNodes(a1);
    Node.printList(l1);
    Node.printList(nthNode(l1, 5));
    
    
  }
  
  public static Node nthNode(Node head, int n) {
    Node aux = head;
    int size = 1;
    while (head.getNext() != null) {
      size++;
      head = head.getNext();
    }
    
    int movements = (size - (n - 1)) % size;
    if (movements == 0) return head;
    head.setNext(aux);
    
    Node end = head;
    
    /**
     * Move
     */
    
    for (int i = 0; i < movements; i++) {
      head = head.getNext();
    }
    end.setNext(null);
    
    
    return head;
  }

}
