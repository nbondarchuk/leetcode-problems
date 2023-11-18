package trees.SymmetricTree_101;

import trees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

class RecursiveSolution {

    private static final TreeNode EMPTY_NODE = new TreeNode(Integer.MAX_VALUE);

    public boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        }

        if (root.left == null || root.right == null) {
            return false;
        }

        List<TreeNode> leftSubtreeOrder = traverse(root.left, this::traversePreorder);
        List<TreeNode> rightSubtreeOrder = traverse(root.right, this::traversePostorder);

        if (leftSubtreeOrder.size() != rightSubtreeOrder.size()) {
            return false;
        }

        for (int i = 0, j = rightSubtreeOrder.size() - 1; i < leftSubtreeOrder.size() && j >= 0; i++, j--) {
            if (leftSubtreeOrder.get(i).val != rightSubtreeOrder.get(j).val) {
                return false;
            }
        }

        return true;
    }

    private void traversePreorder(TreeNode node, List<TreeNode> list) {
        list.add(node);
        if (node.left == null && node.right == null) { // this is a terminal node
            return;
        }

        if (node.left != null) {
            traversePreorder(node.left, list);
        } else {
            list.add(EMPTY_NODE);
        }
        if (node.right != null) {
            traversePreorder(node.right, list);
        } else {
            list.add(EMPTY_NODE);
        }
    }

    private void traversePostorder(TreeNode node, List<TreeNode> list) {
        if (node.left != null || node.right != null) {
            if (node.left != null) {
                traversePostorder(node.left, list);
            } else {
                list.add(EMPTY_NODE);
            }
            if (node.right != null) {
                traversePostorder(node.right, list);
            } else {
                list.add(EMPTY_NODE);
            }
        }
        list.add(node);
    }

    private List<TreeNode> traverse(TreeNode node, BiConsumer<TreeNode, List<TreeNode>> consumer) {
        List<TreeNode> list = new ArrayList<>();
        consumer.accept(node, list);
        return list;
    }
}
