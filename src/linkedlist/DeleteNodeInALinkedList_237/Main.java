package linkedlist.DeleteNodeInALinkedList_237;

import linkedlist.ListNode;

/**
 * <a href="https://leetcode.com/problems/delete-node-in-a-linked-list/">Delete Node in a Linked List</a>
 */
public class Main {

    public static void main(String[] args) {
        ListNode node = new ListNode(2, new ListNode(3, new ListNode(4)));
        ListNode head = new ListNode(1, node);
        System.out.println(head);
        new Solution().deleteNode(node);
        System.out.println(head);
    }
}
