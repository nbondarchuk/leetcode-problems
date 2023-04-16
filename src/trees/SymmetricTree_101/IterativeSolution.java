package trees.SymmetricTree_101;

import trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IterativeSolution {

    private static final TreeNode EMPTY_NODE = new TreeNode(Integer.MAX_VALUE);

    public boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        }

        if (root.left == null || root.right == null) {
            return false;
        }

        List<TreeNode> leftSubtreeOrder = traverseLeft(root.left);
        List<TreeNode> rightSubtreeOrder = traverseRight(root.right);

        if (leftSubtreeOrder.size() != rightSubtreeOrder.size()) {
            return false;
        }

        for (int i = 0; i < leftSubtreeOrder.size(); i++) {
            if (leftSubtreeOrder.get(i).val != rightSubtreeOrder.get(i).val) {
                return false;
            }
        }

        return true;
    }

    List<TreeNode> traverseLeft(TreeNode node) {
        List<TreeNode> result = new ArrayList<>();
        LinkedList<TreeNode> workingQueue = new LinkedList<>();
        workingQueue.add(node);

        TreeNode current;
        while ((current = workingQueue.poll()) != null) {
            result.add(current);

            if (current.left != null) {
                workingQueue.offer(current.left);
            } else {
                if (current != EMPTY_NODE) {
                    workingQueue.offer(EMPTY_NODE);
                }
            }
            if (current.right != null) {
                workingQueue.offer(current.right);
            } else {
                if (current != EMPTY_NODE) {
                    workingQueue.offer(EMPTY_NODE);
                }
            }
        }
        return result;
    }

    List<TreeNode> traverseRight(TreeNode node) {
        List<TreeNode> result = new ArrayList<>();
        LinkedList<TreeNode> workingQueue = new LinkedList<>();
        workingQueue.add(node);

        TreeNode current;
        while ((current = workingQueue.poll()) != null) {
            result.add(current);

            if (current.right != null) {
                workingQueue.offer(current.right);
            } else {
                if (current != EMPTY_NODE) {
                    workingQueue.offer(EMPTY_NODE);
                }
            }
            if (current.left != null) {
                workingQueue.offer(current.left);
            } else {
                if (current != EMPTY_NODE) {
                    workingQueue.offer(EMPTY_NODE);
                }
            }
        }
        return result;
    }
}
