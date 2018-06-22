package dhan.java_data_structures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dhan.java_data_structures.linkedList.LinkedList;

public class LinkedListTest {

  @Test
  public void testAdd() {
    LinkedList list = new LinkedList();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    
    assertEquals("abcd", list.toString());
  }
}
