package trees.ConstructBinaryTreeFromPreorderAndInorderTraversal_105;

import trees.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> imap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            imap.put(inorder[i], i);
        }
        return buildTree(preorder, imap, 0, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, Map<Integer, Integer> imap, int pix, int ileft, int iright) {
        int rval = preorder[pix];
        int imid = imap.get(rval);

        TreeNode node = new TreeNode(rval);
        if (imid > ileft) {
            node.left = buildTree(preorder, imap, pix + 1, ileft, imid - 1);
        }
        if (imid < iright) {
            node.right = buildTree(preorder, imap, pix + imid - ileft + 1, imid + 1, iright);
        }
        return node;
    }
}
