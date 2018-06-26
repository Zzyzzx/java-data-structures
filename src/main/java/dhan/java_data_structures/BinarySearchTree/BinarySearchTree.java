package dhan.java_data_structures.BinarySearchTree;

public class BinarySearchTree {

  public BinaryTreeNode root;
  public int size;

  public BinarySearchTree() {

  }

  public void add(int val) {
    addNode(root, val);
  }

  public void delete(int val) {

  }

  public BinaryTreeNode findNextSmallest(BinaryTreeNode base) {
    if()
  }

  public void addNode(BinaryTreeNode parent, int val) {
    if (parent.value <= val) {
      if (parent.left != null) {
        addNode(parent.left, val);
      } else {
        parent.left = new BinaryTreeNode(val);
      }
    } else if (parent.value > val) {
      if (parent.right != null) {
        addNode(parent.right, val);
      } else {
        parent.right = new BinaryTreeNode(val);
      }
    }
  }

  public boolean validate() {
    return validate(root);
  }

  public boolean validate(BinaryTreeNode node) {
    if (node.left != null) {
      if (node.left.value > node.value) {
        return false;
      } else {
        return validate(node.left);
      }
    }
    if (node.right != null) {
      if (node.right.value < node.value) {
        return false;
      } else {
        return validate(node.right);
      }
    }
    return true;
  }
}
