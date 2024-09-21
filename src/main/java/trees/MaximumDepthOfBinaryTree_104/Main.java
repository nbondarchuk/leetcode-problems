package trees.MaximumDepthOfBinaryTree_104;

import trees.TreeNode;

/**
 * <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/">Maximum Depth of Binary Tree</a>
 */
public class Main {

    public static void main(String[] args) {
        TreeNode leftSubTree = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        TreeNode rightSubTree = new TreeNode(2, new TreeNode(4), new TreeNode(3));

        TreeNode tree = new TreeNode(1, leftSubTree, rightSubTree);

        System.out.println(new Solution().maxDepth(tree));
    }
}
