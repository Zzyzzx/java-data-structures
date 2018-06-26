package dhan.java_data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import dhan.java_data_structures.heaps.MinHeap;

public class HeapTest {

  MinHeap heap = new MinHeap();

  @Test
  public void testValidHeapMethod() {
    int[] invalid = {10, 14, 19, 26, 31, 42, 27, 44, 35, 33, 1};
    int[] valid = {10, 14, 19, 26, 31, 42, 27, 44, 35, 33};
    
    heap.size=11;
    assertFalse(heap.isValidHeap(invalid));
    heap.size=9;
    assertTrue(heap.isValidHeap(valid));
  }

  @Test
  public void heapifyUpTest() {
    int[] heapArray = {10, 14, 19, 26, 31, 42, 27, 44, 35, 33, 1};
    heap.heap = heapArray;
    heap.size = 11;
    heap.heapifyUp(10);

    assertTrue(heap.isValidHeap());
  }

  @Test
  public void heapifyDownTest() {
    int[] heapArray = {33, 14, 19, 26, 31, 42, 27, 44, 35};
    heap.heap = heapArray;
    heap.size = 9;
    heap.heapifyDown(0);

    assertTrue(heap.isValidHeap());
  }
}
