package trees.BinaryTreeLevelOrderTraversalII_107;

import trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }


        Queue<TreeNode> workingQueue = new LinkedList<>();
        workingQueue.add(root);

        while(!workingQueue.isEmpty()) {
            int levelSize = workingQueue.size();
            List<Integer> levelItems = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = workingQueue.remove();
                levelItems.add(node.val);
                if (node.left != null) {
                    workingQueue.add(node.left);
                }
                if (node.right != null) {
                    workingQueue.add(node.right);
                }
            }
            result.add(0, levelItems);
        }

        return result;
    }
}
