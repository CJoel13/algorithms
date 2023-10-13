package e02_LinkedLists;

class Node2 {
  
  
  
  public static void main(String[] args) {
    Node list = new Node(13);
    Node head = list;
    
    for (int i = 0; i < 9; i++) {
      list.setNext(new Node(i));
      list = list.getNext();
    }
    
    printList(head);
    
    /*
     * Add at the end
     */
    Node lastNode = new Node(100);
    
    printList(add(head, lastNode));
    
    /*
     * Delete 4
     */
    printList(delete(head, 4));
    printList(delete(head, 13));
    printList(delete(head, 13));
    
  }
  
  public static Node delete(Node head, int target) {
    Node aux = head;
    /**
     * First item
     */
    if (head.getValue() == target) {
      aux = head.getNext();
      return aux;
    }
    
    /**
     * 2nd, etc item
     */
    Node prev = head;
    Node curr = head.getNext();
    
    
    while (curr != null) {
      if (target == curr.getValue()) {
        prev.setNext(curr.getNext());
        curr = null;
        break;
      }
      prev = prev.getNext();
      curr = curr.getNext();
    }
    
    

    
    return aux;
  }
  
  public static Node add(Node head, Node node) {
    Node aux = head;
    
    while (head.getNext() != null) {
      head = head.getNext();
    }
    
    head.setNext(node);
    return aux;
  }
  
  public static void printList(Node head) {
    do {
      System.out.print("[" + head.getValue() + "] -> ");
      head = head.getNext();
    } while (head != null);
    System.out.println();
  }
  
}

public class Node {
  private int value;
  private Node next;
  
  public Node(Node next) {
    this(next, 0);
  }
  
  public Node(int value) {
    this(null, value);
  }
  
  public Node(Node next, int value) {
    this.next = next;
    this.value = value;
  }
  
  public Node() {}
  
  public int getValue() {
    return this.value;
  }
  
  public Node getNext() {
    return this.next;
  }
  
  public void setValue(int value) {
    this.value = value;
  }
  
  public void setNext(Node next) {
    this.next = next;
  }
 
  public static Node retrieveNodes() {
    Node list = new Node(13);
    Node head = list;
    
    for (int i = 0; i < 9; i++) {
      list.setNext(new Node(i));
      list = list.getNext();
    }
    
    return head;
  }
  
  
  public static Node retrieveNodes(int[] array) {
    Node list = new Node(array[0]);
    Node head = list;
    
    for (int i = 1; i < array.length; i++) {
      list.setNext(new Node(array[i]));
      list = list.getNext();
    }
    
    return head;
  }
  
  public static void printList(Node head) {
    do {
      System.out.print("[" + head.getValue() + "] -> ");
      head = head.getNext();
    } while (head != null);
    System.out.println();
  }
  
}