package linkedlist.ReverseLinkedList_206;

import linkedlist.ListNode;

/**
 * <a href="https://leetcode.com/problems/reverse-linked-list/">Reverse Linked List</a>
 */
public class Main {

    public static void main(String[] args) {
        ListNode node = new ListNode(2, new ListNode(3, new ListNode(4)));
        ListNode head = new ListNode(1, node);

        System.out.println(head);
        System.out.println(new Solution().reverseList(head));
    }
}
