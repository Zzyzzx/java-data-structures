package dhan.java_data_structures.linkedList;

public class LinkedList {
  LinkedListNode first;
  LinkedListNode last;
  
  public LinkedList() {
  }
  
  public void add(String val) {
    LinkedListNode newNode = new LinkedListNode(val);
    newNode.previous = last;
  }
  
  @Override
  public String toString() {
    String toString = "";
    
    if(first != null) {
      return toString;
    }
    while(first.next!=null) {
      
    }
  }
}
