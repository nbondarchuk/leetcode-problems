package trees.FlattenBinaryTreeToLinkedList_114;

import trees.TreeNode;

import java.util.Stack;
import java.util.function.Consumer;

class Solution {

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        traversePreOrder(root, stack::push);

        TreeNode prev = null;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            node.left = null;
            node.right = prev;
            prev = node;
        }
    }

    private void traversePreOrder(TreeNode node, Consumer<TreeNode> nodeConsumer) {
        nodeConsumer.accept(node);
        if (node.left != null) {
            traversePreOrder(node.left, nodeConsumer);
        }
        if (node.right != null) {
            traversePreOrder(node.right, nodeConsumer);
        }
    }
}
