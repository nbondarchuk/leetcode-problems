package trees.BinaryTreeLevelOrderTraversal_102;

import trees.TreeNode;

public class Main {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(3,
                new TreeNode(9), // left subtree
                new TreeNode(20, new TreeNode(15), new TreeNode(7))); // right subtree
        System.out.println(new Solution().levelOrder(tree));
    }
}
