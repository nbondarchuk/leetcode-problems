package trees.FlattenBinaryTreeToLinkedList_114;

import trees.TreeNode;

import java.util.Stack;
import java.util.function.Consumer;

class Solution1 {

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
        if (node == null) {
            return;
        }

        nodeConsumer.accept(node);
        traversePreOrder(node.left, nodeConsumer);
        traversePreOrder(node.right, nodeConsumer);
    }
}
