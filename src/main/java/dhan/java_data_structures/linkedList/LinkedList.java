package dhan.java_data_structures.linkedList;

public class LinkedList {
  public LinkedListNode first;
  public LinkedListNode last;

  public LinkedList() {}

  public void add(String val) {
    LinkedListNode newNode = new LinkedListNode(val);
    if (first == null && last == null) {
      first = newNode;
      last = newNode;
    } else {
      newNode.previous = last;
      last.next = newNode;
      last = newNode;
    }
  }

  @Override
  public String toString() {
    if (first == null) {
      return "";
    }
    return toString(first);
  }

  private String toString(LinkedListNode start) {
    if (start.next == null) {
      return start.value;
    }
    return start.value + toString(start.next);
  }
}
