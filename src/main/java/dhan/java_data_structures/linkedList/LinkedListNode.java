package dhan.java_data_structures.linkedList;

public class LinkedListNode {

  public LinkedListNode previous;
  public LinkedListNode next;
  public String value;

  public LinkedListNode(String value) {
    this.value = value;
    previous=null;
    next=null;
  }
  
  public String toString() {
    return value;
  }
}
