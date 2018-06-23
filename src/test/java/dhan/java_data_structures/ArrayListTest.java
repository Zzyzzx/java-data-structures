package dhan.java_data_structures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dhan.java_data_structures.arrayList.ArrayList;

public class ArrayListTest {

  @Test
  public void testAdd() {
    ArrayList list = new ArrayList();
    list.add("a");
    list.add("b");
    list.add("c");

    assertEquals("a", list.get(0));
    assertEquals("b", list.get(1));
    assertEquals("c", list.get(2));
  }
}
