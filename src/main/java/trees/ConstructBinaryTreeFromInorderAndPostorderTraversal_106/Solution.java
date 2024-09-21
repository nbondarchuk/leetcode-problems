package trees.ConstructBinaryTreeFromInorderAndPostorderTraversal_106;

import trees.TreeNode;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> imap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            imap.put(inorder[i], i);
        }
        return buildTree(postorder, imap, postorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] postorder, Map<Integer, Integer> imap, int pix, int ileft, int iright) {
        int rval = postorder[pix];
        int imid = imap.get(rval);

        TreeNode node = new TreeNode(rval);
        if (ileft < imid) {
            node.left = buildTree(postorder, imap, pix - iright + imid  - 1, ileft, imid - 1);
        }
        if (iright > imid) {
            node.right = buildTree(postorder, imap, pix - 1, imid + 1, iright);
        }
        return node;
    }
}
