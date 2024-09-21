package trees.BinaryTreeLevelOrderTraversal_102;

import trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();

        TreeNodeWithLevel prev;
        List<Integer> tempList = new ArrayList<>();
        Queue<TreeNodeWithLevel> workingQueue = new LinkedList<>();
        workingQueue.add(prev = new TreeNodeWithLevel(root, 0));

        while (workingQueue.peek() != null) {
            TreeNodeWithLevel current = workingQueue.poll();
            if (current.level != prev.level) {
                result.add(tempList);
                tempList = new ArrayList<>();
            }
            tempList.add(current.node.val);
            if (current.node.left != null) {
                workingQueue.add(new TreeNodeWithLevel(current.node.left, current.level + 1));
            }
            if (current.node.right != null) {
                workingQueue.add(new TreeNodeWithLevel(current.node.right, current.level + 1));
            }
            prev = current;
        }
        result.add(tempList);

        return result;
    }

    private static class TreeNodeWithLevel {

        TreeNode node;

        int level;

        TreeNodeWithLevel(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }
}
