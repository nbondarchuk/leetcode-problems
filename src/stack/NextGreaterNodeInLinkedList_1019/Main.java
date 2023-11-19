package stack.NextGreaterNodeInLinkedList_1019;

import linkedlist.ListNode;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/next-greater-node-in-linked-list">Next Greater Node In Linked List</a>
 */
public class Main {

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(5));
        ListNode head = new ListNode(2, node);

        System.out.println(Arrays.toString(new Solution().nextLargerNodes(head)));
    }
}
