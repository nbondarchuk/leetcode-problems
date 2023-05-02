package linkedlist.LinkedListCycle_141;

import linkedlist.ListNode;

/**
 * <a href="https://leetcode.com/problems/linked-list-cycle/">Linked List Cycle</a>
 */
public class Main {

    public static void main(String[] args) {
        ListNode last = new ListNode(-4);
        ListNode head = new ListNode(3, new ListNode(2, new ListNode(0, last)));
        last.next = head;

        System.out.println(new Solution().hasCycle(head));
    }
}
