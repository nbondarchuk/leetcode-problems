package linkedlist.RemoveNthNodeFromEndOfList_19;

import linkedlist.ListNode;

/**
 * <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/">Remove Nth Node From End of List</a>
 */
public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        //ListNode head = new ListNode(1, new ListNode(2));
        System.out.println(new Solution().removeNthFromEnd(head, 2));
    }
}
