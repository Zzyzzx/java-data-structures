package dhan.java_data_structures.arrayList;

public class ArrayList {

  private String[] array;
  private static final int arrayDefaultLength = 10;

  private int size;

  public ArrayList() {
    array = new String[arrayDefaultLength];
    size = 0;
  }

  public String get(int index) throws ArrayIndexOutOfBoundsException {
    return array[index];
  }

  public void add(String val) {
    array[size] = val;
    size++;
  }

  public int size() {
    return size;
  }

  private void doubleArray() {
    String[] newArray = new String[array.length * 2];
    copyArray(array, newArray);
  }

  private void copyArray(String[] orig, String[] copy) {
    if (orig.length > copy.length) {
      throw new ArrayIndexOutOfBoundsException("Array copy destination has size less than original");
    }
    for (int i = 0; i < orig.length; i++)
      copy[i] = orig[i];
  }
}
