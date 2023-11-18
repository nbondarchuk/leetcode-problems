package linkedlist.RemoveNthNodeFromEndOfList_19;

import linkedlist.ListNode;

class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = countSize(head);
        int idx = size - n + 1;
        if (idx == 1) {
            head = head.next;
            return head;
        }

        int counter = 1;
        ListNode iter = head;
        while (iter.next != null) {
            if (counter == idx - 1) {
                iter.next = iter.next.next;
                break;
            }
            counter++;
            iter = iter.next;
        }

        return head;
    }

    private int countSize(ListNode head) {
        int counter = 0;
        while (head != null) {
            counter++;
            head = head.next;
        }
        return counter;
    }
}
