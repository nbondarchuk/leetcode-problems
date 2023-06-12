package linkedlist.ReverseLinkedList_206;

import linkedlist.ListNode;

class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode tempNext = head.next;
            head.next = prev;
            prev = head;
            head = tempNext;
        }
        return prev;
    }
}
