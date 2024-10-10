package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Consumer;

public class TreeNode {

    private static final TreeNode NULL_NODE = new TreeNode(0);

    public int val;

    public TreeNode left;

    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        LinkedList<Integer> values = new LinkedList<>();

        traverse(this, values::add);
        while (values.getLast() == null) {
            values.removeLast();
        }

        return values.toString();
    }

    private void traverse(TreeNode root, Consumer<Integer> valueConsumer) {
        Queue<TreeNode> workingQueue = new LinkedList<>();
        workingQueue.add(root);
        while (workingQueue.peek() != null) {
            TreeNode currentNode = workingQueue.poll();
            valueConsumer.accept(currentNode == NULL_NODE ? null : currentNode.val);
            if (currentNode != NULL_NODE) {
                workingQueue.add(currentNode.left != null ? currentNode.left : NULL_NODE);
                workingQueue.add(currentNode.right != null ? currentNode.right : NULL_NODE);
            }
        }
    }
}
