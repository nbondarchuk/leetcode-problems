package linkedlist.ReverseLinkedList_206;

import linkedlist.ListNode;

public class Solution {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head;
        head = head.next;
        newHead.next = null;

        while (head.next != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }

        head.next = newHead;
        newHead = head;
        return newHead;
    }
}
