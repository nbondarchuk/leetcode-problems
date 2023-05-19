package design.MinStack_155;

import java.util.Stack;

public class MinStack {

    private static class Node {

        int val;

        int min;
    }

    private final Stack<Node> delegate = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        Node node = new Node();
        node.val = val;

        if (delegate.isEmpty()) {
            node.min = val;
        } else {
            node.min = Math.min(delegate.peek().min, val);
        }
        delegate.push(node);
    }

    public void pop() {
        if (delegate.isEmpty()) {
            return;
        }
        delegate.pop();
    }

    public int top() {
        if (delegate.isEmpty()) {
            throw new IllegalStateException("The stack is empty.");
        }
        return delegate.peek().val;
    }

    public int getMin() {
        return delegate.peek().min;
    }
}
