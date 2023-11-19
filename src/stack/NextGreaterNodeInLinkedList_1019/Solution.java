package stack.NextGreaterNodeInLinkedList_1019;

import linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {

    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        head = reverseList(head);
        while (head != null) {
            while (!stack.isEmpty() && stack.peek() <= head.val) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                result.add(0, stack.peek());
            } else {
                result.add(0, 0);
            }

            stack.push(head.val);
            head = head.next;
        }
        return result.stream().mapToInt(i->i).toArray();
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode headNext = head.next;
            head.next = prev;
            prev = head;
            head = headNext;
        }
        return prev;
    }
}
