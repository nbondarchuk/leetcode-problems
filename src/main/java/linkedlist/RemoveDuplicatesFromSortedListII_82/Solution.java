package linkedlist.RemoveDuplicatesFromSortedListII_82;

import linkedlist.ListNode;

class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode sentinel = new ListNode();
        sentinel.next = head;

        ListNode prev = sentinel;
        ListNode iter = sentinel.next;
        while (iter != null && iter.next != null) {
            ListNode next = iter.next;
            if (iter.val == next.val) {
                while (next != null && next.val == iter.val) {
                    next = next.next;
                }
                prev.next = next;
                iter = next;
            } else {
                prev = iter;
                iter = iter.next;
            }
        }

        return sentinel.next;
    }
}
