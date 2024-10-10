package linkedlist.ReverseNodesInKGroup_25;

import linkedlist.ListNode;

import java.util.Stack;

class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode sentinel = new ListNode();

        int c = 0;
        ListNode p = sentinel;
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
            c++;

            if (c == k) {
                while (!stack.isEmpty()) {
                    ListNode node = stack.pop();
                    p.next = node;
                    p = node;
                    p.next = null;
                }
                c = 0;
            }
        }

        Stack<ListNode> stack2 = new Stack<>();
        while (!stack.isEmpty()) {
            stack2.push(stack.pop());
        }

        while (!stack2.isEmpty()) {
            ListNode node = stack2.pop();
            p.next = node;
            p = node;
            p.next = null;
        }

        return sentinel.next;
    }
}