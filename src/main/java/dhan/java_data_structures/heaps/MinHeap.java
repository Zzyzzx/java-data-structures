package dhan.java_data_structures.heaps;

public class MinHeap {

  public int[] heap;
  public int size;
  public int DEFAULT_HEAP_SIZE = 255;

  public MinHeap() {
    heap = new int[DEFAULT_HEAP_SIZE];
    size = 0;
  }

  public int getParentIndex(int child) {
    return (child - 1) / 2;
  }

  public int getLeftChildIndex(int parent) {
    return parent * 2 + 1;
  }

  public int getRightChildIndex(int parent) {
    return parent * 2 + 2;
  }

  public void heapifyUp(int node) {
    int parent = getParentIndex(node);
    if (!isValidIndex(parent) || heap[parent] <= heap[node]) {
      return;
    }
    int temp = heap[parent];
    heap[parent] = heap[node];
    heap[node] = temp;
    heapifyUp(parent);
  }

  public void heapifyDown(int node) {
    int smallestChild = getLeftChildIndex(node);
    if (!isValidIndex(getLeftChildIndex(node))) {
      return;
    }
    if (isValidIndex(getRightChildIndex(node)) && heap[getRightChildIndex(node)] < heap[smallestChild]) {
      smallestChild = getRightChildIndex(node);
    }
    if (heap[node] > heap[smallestChild]) {
      swap(node, smallestChild);
      heapifyDown(smallestChild);
    }
  }

  public void swap(int indexA, int indexB) {
    int temp = heap[indexA];
    heap[indexA] = heap[indexB];
    heap[indexB] = temp;
  }

  public boolean isValidIndex(int index) {
    if (index < 0 || index > size - 1)
      return false;
    return true;
  }

  public boolean isValidHeap() {
    return isValidHeap(heap);
  }

  public boolean isValidHeap(int[] heap) {
    int index = 0;
    while (index < size) {
      int left = getLeftChildIndex(index);
      int right = getRightChildIndex(index);

      if (isValidIndex(left) && heap[left] < heap[index])
        return false;
      if (isValidIndex(right) && heap[right] < heap[index])
        return false;
      index++;
    }
    return true;
  }
}
