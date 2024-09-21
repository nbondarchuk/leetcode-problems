package linkedlist.LinkedListCycleII_142;

import linkedlist.ListNode;

/**
 * <a href="https://leetcode.com/problems/linked-list-cycle-ii/">Linked List Cycle II</a>
 */
public class Main {

    public static void main(String[] args) {
        ListNode last = new ListNode(-4);
        ListNode next = new ListNode(2, new ListNode(0, last));
        ListNode head = new ListNode(3, next);
        last.next = next;

        System.out.println(new Solution().detectCycle(head).val);
    }
}
