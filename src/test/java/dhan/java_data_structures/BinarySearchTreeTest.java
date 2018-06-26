package dhan.java_data_structures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import dhan.java_data_structures.BinarySearchTree.BinarySearchTree;
import dhan.java_data_structures.BinarySearchTree.BinaryTreeNode;

public class BinarySearchTreeTest {

  BinarySearchTree tree;

  @Before
  public void setup() {
    tree = generateTree();
  }

  @Test
  public void testValidate() {
    assertTrue(tree.validate());
  }

  @Test
  public void testSearchRoot() {
    BinaryTreeNode find = tree.search(tree.root, 8);
    assertEquals(8, find.value);
  }

  @Test
  public void testSearchMiddle() {
    BinaryTreeNode find = tree.search(tree.root, 10);
    assertEquals(10, find.value);
  }

  @Test
  public void testSearchLeaf() {
    BinaryTreeNode find = tree.search(tree.root, 7);
    assertEquals(7, find.value);
  }

  // [8,3,10,1,6,null,14,null,null,4,7,null,null,13,null]
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
