package linkedlist.AddTwoNumbers_2;

import linkedlist.ListNode;

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        byte overflow = 0;
        ListNode sentinel = new ListNode();
        ListNode pointer = sentinel;
        while (l1 != null || l2 != null || overflow != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;

            int sum = l1Val + l2Val + overflow;
            overflow = (byte) (sum / 10);
            sum = sum % 10;

            pointer.next = new ListNode(sum);
            pointer = pointer.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return sentinel.next;
    }
}
