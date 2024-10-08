package trees.BinarySearchTreeIterator_173;

import trees.TreeNode;

import java.util.Stack;

class BSTIterator2 implements BSTIterator {

    private final Stack<TreeNode> stack;

    public BSTIterator2(TreeNode root) {
        stack = new Stack<>();
        pushAll(root);
    }

    public int next() {
        TreeNode current = stack.pop();
        pushAll(current.right);
        return current.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void pushAll(TreeNode root) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }
}
