package trees.BinarySearchTreeIterator_173;

import trees.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class BSTIterator1 implements BSTIterator {

    private final Iterator<Integer> iterator;

    public BSTIterator1(TreeNode root) {
        iterator = createIterator(root);
    }

    public int next() {
        return iterator.next();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    private Iterator<Integer> createIterator(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverse(root, list);
        return list.iterator();
    }

    private void traverse(TreeNode root, List<Integer> list) {
        if (root.left != null) {
            traverse(root.left, list);
        }

        list.add(root.val);

        if (root.right != null) {
            traverse(root.right, list);
        }
    }
}
