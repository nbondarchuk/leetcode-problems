package trees.SerializeAndDeserializeBinaryTree_297;

import trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class Codec {

    private static final TreeNode NULL_NODE = new TreeNode(0);

    public String serialize(TreeNode root) {
        LinkedList<Integer> values = new LinkedList<>();
        Queue<TreeNode> workingQueue = new LinkedList<>();
        workingQueue.add(root);
        while (workingQueue.peek() != null) {
            TreeNode currentNode = workingQueue.poll();
            values.add(currentNode == NULL_NODE ? null : currentNode.val);
            if (currentNode != NULL_NODE) {
                workingQueue.add(currentNode.left != null ? currentNode.left : NULL_NODE);
                workingQueue.add(currentNode.right != null ? currentNode.right : NULL_NODE);
            }
        }
        while (values.getLast() == null) {
            values.removeLast();
        }
        return values.toString();
    }

    public TreeNode deserialize(String data) {
        if (data.isEmpty() || "[]".equals(data)) {
            return null;
        }

        int lastSeparatorIdx = 0;
        Token token = nextToken(data, lastSeparatorIdx + 1);
        if (token == null) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(token.value));
        Queue<TreeNode> workingQueue = new LinkedList<>();
        workingQueue.add(root);
        while (!workingQueue.isEmpty()) {
            TreeNode node = workingQueue.poll();
            token = nextToken(data, token.idx + 1);
            if (token == null) {
                break;
            }
            if (!"null".equals(token.value)) {
                node.left = new TreeNode(Integer.parseInt(token.value));
                workingQueue.add(node.left);
            }

            token = nextToken(data, token.idx + 1);
            if (token == null) {
                break;
            }
            if (!"null".equals(token.value)) {
                node.right = new TreeNode(Integer.parseInt(token.value));
                workingQueue.add(node.right);
            }
        }

        return root;
    }

    private Token nextToken(String s, int startPos) {
        int idx = s.indexOf(',', startPos);
        if (idx == -1) {
            idx = s.indexOf(']', startPos);
        }
        if (idx == -1) {
            return null;
        }

        Token token = new Token();
        token.idx = idx;
        token.value = s.substring(startPos, idx).trim();
        return token;
    }

    private static class Token {

        private int idx;

        private String value;
    }
}
