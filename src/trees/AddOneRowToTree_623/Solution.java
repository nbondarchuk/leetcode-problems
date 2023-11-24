package trees.AddOneRowToTree_623;

import trees.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }

        Queue<TreeNode> workingQueue = new LinkedList<>();
        workingQueue.add(root);

        int currentLevel = 1;
        while (true) {
            if (currentLevel == depth - 1) {
                TreeNode node = workingQueue.poll();
                while (node != null) {
                    TreeNode newLeft = new TreeNode(val);
                    newLeft.left = node.left;
                    node.left = newLeft;

                    TreeNode newRight = new TreeNode(val);
                    newRight.right = node.right;
                    node.right = newRight;

                    node = workingQueue.poll();
                }
                return root;
            } else {
                TreeNode node = workingQueue.poll();
                List<TreeNode> list = new LinkedList<>();
                while (node != null) {
                    if (node.left != null) list.add(node.left);
                    if (node.right != null) list.add(node.right);
                    node = workingQueue.poll();
                }
                workingQueue.addAll(list);
                currentLevel++;
            }
        }
    }
}
