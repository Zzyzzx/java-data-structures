package dhan.java_data_structures;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import dhan.java_data_structures.BinarySearchTree.BinarySearchTree;
import dhan.java_data_structures.BinarySearchTree.BinaryTreeNode;

public class BinarySearchTreeTest {

  @Test
  public void testValidate() {
    BinarySearchTree tree = generateTree();

    assertTrue(tree.validate());
  }

  public BinarySearchTree generateTree() {
    BinaryTreeNode a = new BinaryTreeNode(8);
    BinaryTreeNode b = new BinaryTreeNode(3);
    BinaryTreeNode c = new BinaryTreeNode(10);
    BinaryTreeNode d = new BinaryTreeNode(1);
    BinaryTreeNode e = new BinaryTreeNode(6);
    BinaryTreeNode f = new BinaryTreeNode(14);
    BinaryTreeNode g = new BinaryTreeNode(4);
    BinaryTreeNode h = new BinaryTreeNode(7);
    BinaryTreeNode i = new BinaryTreeNode(13);

    BinarySearchTree tree = new BinarySearchTree();
    tree.root = a;
    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    c.right = f;
    e.left = g;
    e.right = h;
    f.left = i;

    return tree;
  }
}
