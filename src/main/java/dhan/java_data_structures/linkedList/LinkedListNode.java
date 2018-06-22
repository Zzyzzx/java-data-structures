package dhan.java_data_structures.linkedList;

public class LinkedListNode {

  LinkedListNode previous;
  LinkedListNode next;
  String value;

  public LinkedListNode(String value) {
    this.value = value;
    previous=null;
    next=null;
  }
}
