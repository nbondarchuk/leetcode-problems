package trees.BinaryTreeRightSideView_199;

import trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result, 0);
        return result;
    }

    private void traverse(TreeNode node, List<Integer> result, int level) {
        if (node == null) {
            return;
        }

        if (level == result.size()) {
            result.add(node.val);
        }

        traverse(node.right, result, level + 1);
        traverse(node.left, result, level + 1);
    }
}
