package linkedlist.ReverseLinkedListII_92;

import linkedlist.ListNode;

class Solution {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode sentinel = new ListNode();
        sentinel.next = head;

        ListNode prev = sentinel;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        ListNode cur = prev.next;
        for (int i = 0; i < right - left; i++) {
            ListNode fwd = cur.next;
            cur.next = fwd.next;
            fwd.next = prev.next;
            prev.next = fwd;
        }

        return sentinel.next;
    }
}
