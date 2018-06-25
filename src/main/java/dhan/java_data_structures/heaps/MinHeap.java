package dhan.java_data_structures.heaps;

public class MinHeap {

  public int[] heap;
  public int size;
  public int DEFAULT_HEAP_SIZE = 255;

  public MinHeap() {
    heap = new int[DEFAULT_HEAP_SIZE];
    size = 0;
  }

  public int getLeftChild(int parent) {
    return parent * 2 + 1;
  }

  public int getRightChild(int parent) {
    return parent * 2 + 2;
  }
}
